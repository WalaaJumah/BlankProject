/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classgroups = {"2.13 Brands Page", "1.2 High Severity"},description This class make sure all pages related to the Brand pages from search screen works fine
 */

package sporter_test;

import core.BasePage;
import core.BaseTest;
import core.DataHelperAndWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.AeProductDetailsPage;
import sporter_pages.AeSearchPage;
import sporter_pages.AeSportSupplementsCategoryPage;


public class AeBrandsTestCases extends BaseTest {

    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Switching to UAE store", priority = 1)
    public void switchToUaeStore(){
        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeProductDetailsPage.switchToAECountry();
        if(webDriver.getCurrentUrl().contains(aeProductDetailsPage.aeDomain)){
            System.out.println("You are in UAE Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+aeDomain);
            CloseInitialDialog();
        }
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Jym supplementJym supplement brand correctly", priority =2 )
    public void VerifyAbilityToAccessAllPagesRelatedToJymSupplementJymSupplementBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(0),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(0).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(0).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Blender Bottle brand correctly", priority =3 )
    public void VerifyAbilityToAccessAllPagesRelatedToBlenderBottleBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(1),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(1).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(1).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the V3 Apparel brand correctly", priority =4 )
    public void VerifyAbilityToAccessAllPagesRelatedToV3ApparelBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(2),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(2).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(2).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.3 Medium Severity"},description = "Make sure the ability to access all pages related to the Yoga Design Lab brand correctly", priority =5 )
    public void VerifyAbilityToAccessAllPagesRelatedToYogaDesignLabBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(3),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(3).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(3).click();
        aeSearchPage.verifyTheDisplayedPageDoesNotHaveErrors();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.3 Medium Severity"},description = "Make sure the ability to access all pages related to the Terry Naturally brand correctly", priority =6 )
    public void VerifyAbilityToAccessAllPagesRelatedToTerryNaturallyBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitForTime(3000);
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(4),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(4).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(4).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeSearchPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Swanson Vitamins brand correctly", priority =7 )
    public void VerifyAbilityToAccessAllPagesRelatedToSwansonVitaminsBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(5),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(5).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(5).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Efx Sports brand correctly", priority =8 )
    public void VerifyAbilityToAccessAllPagesRelatedToEfxSportsBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(6),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(6).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(6).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Planetary Herbals brand correctly", priority =9 )
    public void VerifyAbilityToAccessAllPagesRelatedToPlanetaryHerbalsBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(7),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(7).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(7).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    //There's a bug here
    @Test(groups = {"2.13 Brands Page", "1.3 Medium Severity"},description = "Make sure the ability to access all pages related to the nivea brand correctly", priority =10 )
    public void VerifyAbilityToAccessAllPagesRelatedToNiveaBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(8),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(8).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(8).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the puma brand correctly", priority =11 )
    public void VerifyAbilityToAccessAllPagesRelatedToPumaBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(9),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(9).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(9).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Women Best brand correctly", priority =12 )
    public void VerifyAbilityToAccessAllPagesRelatedToWomensBestBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(10),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(10).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(10).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Health Aid brand correctly", priority =13 )
    public void VerifyAbilityToAccessAllPagesRelatedToHealthAidBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(11),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(11).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(11).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    //There's a bug here
    @Test(groups = {"2.13 Brands Page", "1.3 Medium Severity"},description = "Make sure the ability to access all pages related to the O.a Foods brand correctly", priority =14 )
    public void VerifyAbilityToAccessAllPagesRelatedToOAFoodsBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(12),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(12).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(12).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Rainbow Light brand correctly", priority =15 )
    public void VerifyAbilityToAccessAllPagesRelatedToRainbowLightBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(13),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(13).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(13).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    //There's a bug here
    @Test(groups = {"2.13 Brands Page", "1.3 Medium Severity"},description = "Make sure the ability to access all pages related to the Swisse brand correctly", priority =16)
    public void VerifyAbilityToAccessAllPagesRelatedToSwisseBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(14),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(14).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(14).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Ghost brand correctly", priority =17 )
    public void VerifyAbilityToAccessAllPagesRelatedToGhostBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(15),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(15).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(15).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    //There's a bug here
    @Test(groups = {"2.13 Brands Page", "1.3 Medium Severity"},description = "Make sure the ability to access all pages related to the Oomf-nutrition brand correctly", priority =18 )
    public void VerifyAbilityToAccessAllPagesRelatedTOoomfNutritionBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(16),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(16).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(16).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Full Green brand correctly", priority =19 )
    public void VerifyAbilityToAccessAllPagesRelatedTFullGreenBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(17),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(17).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(17).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    //There's a bug here
    @Test(groups = {"2.13 Brands Page", "1.3 Medium Severity"},description = "Make sure the ability to access all pages related to the Planet Organic brand correctly", priority =20 )
    public void VerifyAbilityToAccessAllPagesRelatedToPlanetOrganicBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(18),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(18).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(18).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Life Extension brand correctly", priority =21 )
    public void VerifyAbilityToAccessAllPagesRelatedToLifeExtensionBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(19),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(19).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(19).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Sporter brand correctly", priority =22 )
    public void VerifyAbilityToAccessAllPagesRelatedToSporterBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(20),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(20).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(20).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    //There's a bug here
    @Test(groups = {"2.13 Brands Page", "1.3 Medium Severity"},description = "Make sure the ability to access all pages related to the Divine Health brand correctly", priority =23 )
    public void VerifyAbilityToAccessAllPagesRelatedToDivineHealthBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(21),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(21).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(21).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Titin Force brand correctly", priority =24 )
    public void VerifyAbilityToAccessAllPagesRelatedToTitinForceBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(22),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(22).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(22).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Sotru brand correctly", priority =25 )
    public void VerifyAbilityToAccessAllPagesRelatedToSotruBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(23),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(23).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(23).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    //There's a bug here
    @Test(groups = {"2.13 Brands Page", "1.3 Medium Severity"},description = "Make sure the ability to access all pages related to the Super Nutrition brand correctly", priority =26 )
    public void VerifyAbilityToAccessAllPagesRelatedToSuperNutritionBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(24),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(24).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(24).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    //There's a bug here
    @Test(groups = {"2.13 Brands Page", "1.3 Medium Severity"},description = "Make sure the ability to access all pages related to the Lizi’s Granola brand correctly", priority =27 )
    public void VerifyAbilityToAccessAllPagesRelatedToLiziGranolaBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(25),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(25).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(25).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Nairn’s brand correctly", priority =28 )
    public void VerifyAbilityToAccessAllPagesRelatedToNairnBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(26),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(26).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(26).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    //There's a bug here
    @Test(groups = {"2.13 Brands Page", "1.3 Medium Severity"},description = "Make sure the ability to access all pages related to the IRemedies brand correctly", priority =29 )
    public void VerifyAbilityToAccessAllPagesRelatedToIRemediesBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(27),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(27).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(27).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Chike Nutrition brand correctly", priority =30 )
    public void VerifyAbilityToAccessAllPagesRelatedToChikeNutritionBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(28),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(28).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(28).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Fitmark brand correctly", priority =31 )
    public void VerifyAbilityToAccessAllPagesRelatedToFitmarkBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(29),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(29).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(29).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Quest Nutrition brand correctly", priority =32 )
    public void VerifyAbilityToAccessAllPagesRelatedToQuestNutritionBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(30),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(30).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(30).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Xtend brand correctly", priority =33 )
    public void VerifyAbilityToAccessAllPagesRelatedToXtendBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(31),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(31).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(31).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Cellucor brand correctly", priority =34 )
    public void VerifyAbilityToAccessAllPagesRelatedToCellucorBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(32),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(32).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(32).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Bpi Sports brand correctly", priority =35 )
    public void VerifyAbilityToAccessAllPagesRelatedToBpiSportsBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(33),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(33).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(33).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Animal Nutrition brand correctly", priority =36 )
    public void VerifyAbilityToAccessAllPagesRelatedToAnimalNutritionBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(34),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(34).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(34).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    //There's a bug here
    @Test(groups = {"2.13 Brands Page", "1.3 Medium Severity"},description = "Make sure the ability to access all pages related to the Sahale Snacks brand correctly", priority =37 )
    public void VerifyAbilityToAccessAllPagesRelatedToSahaleSnacksBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(35),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(35).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(35).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
         if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
             System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Universal Nutrition brand correctly", priority =38 )
    public void VerifyAbilityToAccessAllPagesRelatedToUniversalNutritionBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(36),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(36).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(36).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Flahavan's brand correctly", priority =39 )
    public void VerifyAbilityToAccessAllPagesRelatedToFlahavansBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(37),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(37).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(37).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Bobs Red Mill brand correctly", priority =40 )
    public void VerifyAbilityToAccessAllPagesRelatedToBobsRedMillBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(38),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(38).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(38).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Nu Hair brand correctly", priority =41 )
    public void VerifyAbilityToAccessAllPagesRelatedToNuHairBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(39),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(39).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(39).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to theShen Min brand correctly", priority =42 )
    public void VerifyAbilityToAccessAllPagesRelatedToShenMinBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(40),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(40).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(40).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Natrol brand correctly", priority =43 )
    public void VerifyAbilityToAccessAllPagesRelatedToNatrolBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(41),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(41).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(41).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Pandomar brand correctly", priority =44 )
    public void VerifyAbilityToAccessAllPagesRelatedToPandomarBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(42),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(42).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(42).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Organic Larder brand correctly", priority =45 )
    public void VerifyAbilityToAccessAllPagesRelatedToOrganicLarderBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(43),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(43).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(43).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Russian Bear brand correctly", priority =46 )
    public void VerifyAbilityToAccessAllPagesRelatedToRussianBearBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(44),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(44).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(44).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Performa brand correctly", priority =47 )
    public void VerifyAbilityToAccessAllPagesRelatedToPerformaBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(45),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(45).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(45).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Webber Naturals brand correctly", priority =48 )
    public void VerifyAbilityToAccessAllPagesRelatedToWebberNaturalsBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(46),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(46).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(46).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Prolab brand correctly", priority =49 )
    public void VerifyAbilityToAccessAllPagesRelatedToProlabBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(47),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(47).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(47).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Jobedu brand correctly", priority =50 )
    public void VerifyAbilityToAccessAllPagesRelatedToJobeduBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(48),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(48).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(48).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Windmill brand correctly", priority =51 )
    public void VerifyAbilityToAccessAllPagesRelatedToWindmillBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(49),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(49).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(49).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Orgain brand correctly", priority =52 )
    public void VerifyAbilityToAccessAllPagesRelatedToOrgainBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(50),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(50).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(50).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Optimum Nutrition brand correctly", priority =53 )
    public void VerifyAbilityToAccessAllPagesRelatedToOptimumNutritionBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(51),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(51).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(51).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    //There's a bug here
    @Test(groups = {"2.13 Brands Page", "1.3 Medium Severity"},description = "Make sure the ability to access all pages related to the Applied Nutrition brand correctly", priority =54 )
    public void VerifyAbilityToAccessAllPagesRelatedToAppliedNutritionBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(52),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(52).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(52).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Hunter Foods brand correctly", priority =55 )
    public void VerifyAbilityToAccessAllPagesRelatedToHunterFoodsBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(53),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(53).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(53).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
    @Test(groups = {"2.13 Brands Page", "1.2 High Severity"},description = "Make sure the ability to access all pages related to the Nutrex Research brand correctly", priority =56 )
    public void VerifyAbilityToAccessAllPagesRelatedToNutrexResearchBrandCorrectly()
    {   AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage.getSearchBtn().click();
        aeSearchPage.getBrandsTab().click();
        DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(54),5,webDriver);
        String expectedUrl= aeSearchPage.getBrandsListInBrandPage().get(54).getAttribute("href");
        aeSearchPage.getBrandsListInBrandPage().get(54).click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl)," The URL of the brand page is incorrect, The URL: "+ webDriver.getCurrentUrl());
        aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
                    if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);
    }
}