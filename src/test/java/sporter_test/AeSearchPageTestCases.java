package sporter_test;

import core.BaseTest;
import core.DataHelperAndWait;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.AEMegaMenuPage;
import sporter_pages.AeProductDetailsPage;
import sporter_pages.AeSearchPage;
import sporter_pages.AeSportSupplementsCategoryPage;

import static org.testng.Assert.*;

public class AeSearchPageTestCases extends BaseTest {
    private AeSearchPage aeSearchPage;
    private AeProductDetailsPage aeProductDetailsPage;
    private AEFooterPageTestCases aeFooterPageTestCases;
    private AEMegaMenuTestCases aeMegaMenuTestCases;
    private AEMegaMenuPage aeMegamenuPage;
    Actions action;
    String searchUrl="catalogsearch/result/?q=";

    @Test(description = "Verify clicking on the search icon will redirect the user to the search screen", priority = 1)
    public void verifyClickingOnSearchIconWillRedirectUserTOTheSearchScreen() {
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        aeMegamenuPage.switchToAECountry();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(searchUrl));
    }
    @Test(description = "Make sure all search tabs(All, Products, Articles, Brands) tabs appearing correctly in the search screen", priority = 2)
    public void verifyAllSearchTabsLikeAll_Products_Articles_AndBrandsTabsAppearCorrectlyInTheSearchScreen() {
        aeSearchPage=new AeSearchPage(webDriver);
        this.verifyClickingOnSearchIconWillRedirectUserTOTheSearchScreen();
        Assert.assertTrue(aeSearchPage.getAllTab().isDisplayed(),"All tab is missing");
        Assert.assertEquals(aeSearchPage.getAllTab().getText(), "ALL ","The All tab have incorrect name");
        Assert.assertTrue(aeSearchPage.getProductsTab().isDisplayed(),"Products tab is missing");
        Assert.assertEquals(aeSearchPage.getProductsTab().getText(), "PRODUCTS ","Products tab have incorrect name");
        Assert.assertTrue(aeSearchPage.getArticlesTab().isDisplayed(),"Articles tab is missing");
        Assert.assertEquals(aeSearchPage.getArticlesTab().getText(), "ARTICLES ","Articles tab have incorrect name");
       Assert.assertTrue(aeSearchPage.getBrandsTab().isDisplayed(),"Brands tab is missing");
       Assert.assertEquals(aeSearchPage.getBrandsTab().getText(), "BRANDS ","Brands tab have incorrect name");
    }
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Search Page", priority = 3)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInSearchPage(){
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnSearchIconWillRedirectUserTOTheSearchScreen();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
    }
    //      The following Test Cases handle displaying the Mega Menu from search Page
    @Test(description = "Verify that the ShopBy Menu Is Displayed When Hovering On It From search Page", priority = 4)
    public void verifyShopByMenuIsDisplayedWhenHoveringOnItFromSearchPage() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        this.verifyClickingOnSearchIconWillRedirectUserTOTheSearchScreen();
        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getSubMenuSection().isDisplayed());
    }

    @Test(description = "Verify that the Sport Supplements Menu Is Displayed When Hovering On It From search Page", priority = 5)
    public void verifySportSupplementsMenuIsDisplayedWhenHoveringOnItFromSearchPage() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        this.verifyClickingOnSearchIconWillRedirectUserTOTheSearchScreen();
        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getMegaMenuSection().isDisplayed());
    }

    @Test(description = "Verify that the Vitamins And Health Menu Is Displayed When Hovering On It From search Page", priority = 6)
    public void verifyVitaminsAndHealthMenuIsDisplayedWhenHoveringOnItFromSearchPage() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        this.verifyClickingOnSearchIconWillRedirectUserTOTheSearchScreen();
        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getMegaMenuSection().isDisplayed());
    }

    @Test(description = "Verify that the Healthy Food Menu Is Displayed When Hovering On It From search Page", priority = 7)
    public void verifyHealthyFoodMenuIsDisplayedWhenHoveringOnItFromSearchPage() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        this.verifyClickingOnSearchIconWillRedirectUserTOTheSearchScreen();
        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getMegaMenuSection().isDisplayed());
    }

    @Test(description = "Verify that the Sports Menu Is Displayed When Hovering On It From search Page", priority = 8)
    public void verifySportsMenuIsDisplayedWhenHoveringOnItFromSearchPage() {
        aeMegamenuPage = new AEMegaMenuPage(webDriver);
        action = new Actions(webDriver);
        this.verifyClickingOnSearchIconWillRedirectUserTOTheSearchScreen();
        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
        Assert.assertTrue(aeMegamenuPage.getMegaMenuSection().isDisplayed());
    }
    //All Tab
    @Test(description = "Make sure clicking on the All tab will redirect the user to the correct page", priority = 9)
    public void verifyClickingOnAllTabRedirectUserToCorrectPage(){
        aeSearchPage=new AeSearchPage(webDriver);
        this.verifyClickingOnSearchIconWillRedirectUserTOTheSearchScreen();
        aeSearchPage.getAllTab().click();
        assertTrue(aeSearchPage.getProductsSectionInAllPage().isDisplayed(),"Products Section in All tab is missing");
        assertTrue(aeSearchPage.getBrandsSectionInAllPage().isDisplayed(),"Brands Section in All tab is missing");
        assertTrue(aeSearchPage.getArticlesSectionInAllPage().isDisplayed(),"Articles Section in All tab is missing");
    }
    //There's a bug here due to the products list is not appear after visit the PDP then go to All search page
    @Test(description = "Make sure the ability to access all products appearing below the products section in the All Page", priority = 10)
    public void verifyAbilityToAccessAllProductsListedBelowTheProductsSectionInTheAllTabCorrectly(){
        aeSearchPage=new AeSearchPage(webDriver);
        aeProductDetailsPage=new AeProductDetailsPage(webDriver);
        String expectedProductURL;
        this.verifyClickingOnSearchIconWillRedirectUserTOTheSearchScreen();
        aeSearchPage.getAllTab().click();
        for(int i=0; i<aeSearchPage.getProductCardInProductsSection().size();i++){
            expectedProductURL=aeSearchPage.getProductCardInProductsSection().get(i).getAttribute("href");
            aeSearchPage.getProductCardInProductsSection().get(i).click();
            Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedProductURL));
            aeProductDetailsPage.getSearchBtn().click();
            aeSearchPage.getAllTab().click();
            DataHelperAndWait.waitToBeVisible(aeSearchPage.getProductsListInAllTab(),5);

        }
    }

}