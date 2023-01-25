//package sporter_test;
//
//import core.BasePage;
//import core.BaseTest;
//import core.DataHelperAndWait;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import sporter_pages.*;
//
//import static org.testng.Assert.*;
//
//public class AeSearchPageTestCases extends BaseTest {
//    Actions action;
//
//    @Test(groups = "All Smoke Testing Result",description = "Search Page- Switching to UAE store", priority = 1)
//    public void switchToUaeStore(){
//        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage = new AeWomenOnlyCategoryPage(webDriver);
//        aeWomenOnlyCategoryPage.switchToAECountry();
//        if(webDriver.getCurrentUrl().contains(aeWomenOnlyCategoryPage.aeDomain)){
//            System.out.println("You are in UAE Store");
//        }
//        else {
//            webDriver.navigate().to(BasePage.BaseURL+aeDomain);
//            CloseInitialDialog();          }
//    }
//
//    @Test(groups = {"Search","All Smoke Testing Result","1. Critical Severity"},description = "Verify clicking on the search button will redirect the user to the search screen", priority = 1)
//    public void verifyClickingOnSearchIconWillRedirectUserTOTheSearchScreen() {
//        AeProductDetailsPage aeProductDetailsPage = new AeProductDetailsPage(webDriver);
//        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
//        aeProductDetailsPage.getSearchBtn().click();
//        DataHelperAndWait.waitForUrlContains(aeProductDetailsPage.searchUrl,webDriver);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeProductDetailsPage.searchUrl));
//    }
//    @Test(groups = {"Search", "1. Critical Severity"},description = "Make sure all search tabs(All, Products, Articles, Brands) tabs appearing correctly in the search screen", priority = 2)
//    public void verifyAllSearchTabsLikeAll_Products_Articles_AndBrandsTabsAppearCorrectlyInTheSearchScreen() {
//        AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
//        this.verifyClickingOnSearchIconWillRedirectUserTOTheSearchScreen();
//        Assert.assertTrue(aeSearchPage.getAllTab().isDisplayed(),"All tab is missing");
//        Assert.assertEquals(aeSearchPage.getAllTab().getText(), "ALL ","The All tab have incorrect name");
//        Assert.assertTrue(aeSearchPage.getProductsTab().isDisplayed(),"Products tab is missing");
//        Assert.assertEquals(aeSearchPage.getProductsTab().getText(), "PRODUCTS ","Products tab have incorrect name");
//        Assert.assertTrue(aeSearchPage.getArticlesTab().isDisplayed(),"Articles tab is missing");
//        Assert.assertEquals(aeSearchPage.getArticlesTab().getText(), "ARTICLES ","Articles tab have incorrect name");
//       Assert.assertTrue(aeSearchPage.getBrandsTab().isDisplayed(),"Brands tab is missing");
//       Assert.assertEquals(aeSearchPage.getBrandsTab().getText(), "BRANDS ","Brands tab have incorrect name");
//    }
//    @Test(groups = {"Search", "4. Low Severity"},description = "Search Page-Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Search Page", priority = 3)
//    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInSearchPage(){
//        AEFooterPage aeFooterPage = new AEFooterPage(webDriver);
//        Assert.assertTrue(aeFooterPage.getPageBottomSection().isDisplayed());
//        for (int i = 0; i < aeFooterPage.getPageBottomBlocksList().size(); i++) {
//            Assert.assertTrue(aeFooterPage.getPageBottomBlocksList().get(i).isDisplayed());
//            switch (i) {
//                case 0:
//                    Assert.assertEquals(aeFooterPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
//                    Assert.assertEquals(aeFooterPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
//                case 1:
//                    Assert.assertEquals(aeFooterPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
//                    Assert.assertEquals(aeFooterPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
//                case 2:
//                    Assert.assertEquals(aeFooterPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
//                    Assert.assertEquals(aeFooterPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
//            }
//        }
//    }
//    //      The following Test Cases handle displaying the Mega Menu from search Page
//    @Test(groups = {"Search","All Smoke Testing Result","3. Medium Severity"},description = "Search Page- Make sure all menus appearing in the Mega Menu are displayed correctly when hovering on them from Search page", priority = 4)
//    public void verifyAllMenusInMegaMenuAreDisplayedCorrectlyWhenHoveringOnItFromSearchPage() {
//        AEMegaMenuPage aeMegamenuPage = new AEMegaMenuPage(webDriver);
//        action = new Actions(webDriver);
//        this.verifyClickingOnSearchIconWillRedirectUserTOTheSearchScreen();
//        action.moveToElement(aeMegamenuPage.getShopeByMenu()).perform();
//        Assert.assertTrue(aeMegamenuPage.getSubMenuSection().isDisplayed());
//        action.moveToElement(aeMegamenuPage.getSportSupplementsMainMenu()).perform();
//        Assert.assertTrue(aeMegamenuPage.getMegaMenuSection().isDisplayed());
//        action.moveToElement(aeMegamenuPage.getVitaminsAndHealthMainMenu()).perform();
//        Assert.assertTrue(aeMegamenuPage.getMegaMenuSection().isDisplayed());
//        action.moveToElement(aeMegamenuPage.getHealthyFoodMainMenu()).perform();
//        Assert.assertTrue(aeMegamenuPage.getMegaMenuSection().isDisplayed());
//        action.moveToElement(aeMegamenuPage.getSportsMainMenu()).perform();
//        Assert.assertTrue(aeMegamenuPage.getMegaMenuSection().isDisplayed());
//    }
//    //All Tab
//    @Test(groups = {"Search", "1. Critical Severity"},description = "Search Page- Make sure clicking on the All tab will redirect the user to the correct page", priority = 5)
//    public void verifyClickingOnAllTabRedirectUserToCorrectPage(){
//        AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
//        this.verifyClickingOnSearchIconWillRedirectUserTOTheSearchScreen();
//        aeSearchPage.getAllTab().click();
//        assertTrue(aeSearchPage.getProductsSectionInAllPage().isDisplayed(),"Products Section in All tab is missing");
//        assertTrue(aeSearchPage.getBrandsSectionInAllPage().isDisplayed(),"Brands Section in All tab is missing");
//        assertTrue(aeSearchPage.getArticlesSectionInAllPage().isDisplayed(),"Articles Section in All tab is missing");
//    }
//    //There's a bug here due to the products list is not appear after visit the PDP then go to All search page
//    @Test(groups = {"Search","All Smoke Testing Result","2. High Severity"},description = "Search Page- Make sure the ability to access all products appearing below the products section in the All Page", priority = 6)
//    public void verifyAbilityToAccessAllProductsListedBelowTheProductsSectionInTheAllTabCorrectly(){
//        AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
//        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnSearchIconWillRedirectUserTOTheSearchScreen();
//        aeSearchPage.getAllTab().click();
////        for(int i=0; i<aeSearchPage.getProductCardInProductsSection().size();i++){
////            DataHelperAndWait.waitToBeVisible(aeSearchPage.getProductCardInProductsSection().get(i),webDriver);
////            expectedProductURL=aeSearchPage.getProductCardInProductsSection().get(i).getAttribute("href");
//            aeSearchPage.getFirstProductCardInProductsSection().click();
////            Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedProductURL));
//            aeProductDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
//
////        }
//    }
//
//
//    @Test(groups = {"Search", "1. Critical Severity"},description = "Search Page- Make sure the ability to access all brands appearing in the Brands Page", priority = 7)
//    public void verifyAbilityToAccessAllBrandsListedInBrandsPageCorrectly(){
//        AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
//        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        String expectedProductURL;
//        this.verifyClickingOnSearchIconWillRedirectUserTOTheSearchScreen();
//        aeSearchPage.getBrandsTab().click();
//        for(int i=0; i<aeSearchPage.getBrandsListInBrandPage().size();i++){
//            DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(i),webDriver);
////            expectedProductURL=aeSearchPage.getBrandsListInBrandPage().get(i).getAttribute("href");
//            aeSearchPage.getBrandsListInBrandPage().get(i).click();
//            aeSearchPage.verifyTheDisplayedPageDoesNotHaveErrors();
////            DataHelperAndWait.waitForUrlContains(expectedProductURL,webDriver);
////            Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedProductURL));
//            aeProductDetailsPage.getSearchBtn().click();
//            aeSearchPage.getBrandsTab().click();
//            DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandsListInBrandPage().get(i),webDriver);
//            aeSearchPage.verifyTheDisplayedPageDoesNotHaveErrors();
//
//        }
//    }
//    @Test(groups = {"Search", "3. Medium Severity"},description = "Search Page- Make sure the the number of Brands Result retrieve a correct number", priority = 8)
//    public void verifyAbilityNumberOfBrandsResultRetrieveCorrectValue(){
//        AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
//        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnSearchIconWillRedirectUserTOTheSearchScreen();
//        aeSearchPage.getBrandsTab().click();
//        String numberOfProductInTheList=aeSearchPage.getNumberOfSearchResultInBrandsTab().getText();
//        String numberOfProductWithOutItemLabel= numberOfProductInTheList.replace(") Items","");
//        String numberOfProductWithOutResultLabel= numberOfProductWithOutItemLabel.replace("Results: (","");
//        int numberOfProductInTheListInInt=Integer.parseInt(numberOfProductWithOutResultLabel);
//        Assert.assertEquals(numberOfProductInTheListInInt, aeSearchPage.getBrandsListInBrandPage().size(),"The number of Brands Result retrieve incorrect number");
//    }
//    @Test(groups = {"Search", "1. Critical Severity"},description = "Search Page- Make sure the ability to access all brands appearing below the Brands section in the All Page", priority = 9)
//    public void verifyAbilityToAccessAllBrandsListedBelowTheBrandsSectionInTheAllTabCorrectly(){
//        AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
//        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        String expectedProductURL;
//        this.verifyClickingOnSearchIconWillRedirectUserTOTheSearchScreen();
//        aeSearchPage.getAllTab().click();
//        for(int i=0; i<aeSearchPage.getBrandCardInProductsSection().size();i++){
//            DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandCardInProductsSection().get(i),webDriver);
//            expectedProductURL=aeSearchPage.getBrandCardInProductsSection().get(i).getAttribute("href");
//            aeSearchPage.getBrandCardInProductsSection().get(i).click();
//            Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedProductURL));
//            aeProductDetailsPage.getSearchBtn().click();
//            aeSearchPage.getAllTab().click();
//            DataHelperAndWait.waitToBeVisible(aeSearchPage.getBrandCardInProductsSection().get(i),webDriver);
//
//        }
//    }
//// Search Result
//    @Test(groups = {"Search", "3. Medium Severity"},description = "Search Page- Make sure the search result matched with what the user search for", priority = 10)
//    public void verifyTheSearchResultMatchedWithWhatTheUserSearch(){
//        AeSearchPage aeSearchPage=new AeSearchPage(webDriver);
//        AeProductDetailsPage aeProductDetailsPage=new AeProductDetailsPage(webDriver);
//        aeProductDetailsPage.getSearchField().sendKeys("Basixs ");
//        aeProductDetailsPage.getSearchBtn().click();
//        for(int i=0; i<aeSearchPage.getProductsResult().size();i++){
//            DataHelperAndWait.waitToBeVisible(aeSearchPage.getProductsResult().get(i),webDriver);
//            aeSearchPage.getProductsResult().get(i).click();
//            Assert.assertTrue(aeSearchPage.getProductNameInThePDP().getText().contains("Basix ")," The product "+ aeSearchPage.getProductNameInThePDP().getText() +" does not contains Basixs word");
//            boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
//            assertFalse(verifyTitle, "Page Not Found Is Displayed and the URL is "+webDriver.getCurrentUrl());
//            boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
//            assertFalse(isTheElementPresent, "The page is empty and the URL is "+webDriver.getCurrentUrl());
//            boolean isExceptionPagePresent = webDriver.getPageSource().contains("An error has happened during application run. See exception log for details.");
//            boolean isTheElementPresent2 = webDriver.getPageSource().contains("this offer is not available in your country");
//            assertTrue(isTheElementPresent2, "The  offer is not available in your country page is displayed "+webDriver.getCurrentUrl());
//            assertFalse(isExceptionPagePresent, "An error has happened during application run. See exception log for details in page "+ "The URL is"+webDriver.getCurrentUrl());
//            aeProductDetailsPage.getSearchField().sendKeys("Basixs ");
//            aeProductDetailsPage.getSearchBtn().click();
//        }
//    }
//
//}
