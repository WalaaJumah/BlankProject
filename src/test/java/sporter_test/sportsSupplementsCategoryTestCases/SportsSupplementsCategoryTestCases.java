/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_test.sportsSupplementsCategoryTestCases;

import core.BaseTest;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.annotations.Test;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.HomePage;
import sporter_pages.productPage.ProductDetailsPage;
import sporter_pages.sportsSupplementsCategoryPages.SportsSupplementsCategoryPage;

import java.io.IOException;

public class SportsSupplementsCategoryTestCases extends BaseTest {
    String storeCountry;
    String countryCode;

    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:Sports Supplements Category- Make sure clicking on the Sports Supplements Category Appears In MegaMenu Redirect User To CorrectURL", priority = 2)
    public void verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL() throws IOException {
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage= new SportsSupplementsCategoryPage(webDriver);
        sportsSupplementsCategoryPage.clickOnSportsSupplementMainMenu();
        sportsSupplementsCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        WebElementsAssertion.validateTheCurrentUrlContainsString(sportsSupplementsCategoryPage.sportSupplementsUrl,webDriver);
    }
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:Sports Supplements Category- Make sure clicking on the Sports Supplements Category from ShopBy Menu Redirect User To CorrectURL", priority = 3)
    public void verifyClickingOnSportsSupplementsCategoryFromShopByMenuRedirectUserToCorrectURL() throws IOException {
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage= new SportsSupplementsCategoryPage(webDriver);
        sportsSupplementsCategoryPage.clickOnSportsSupplementFromShopByMenu();
        sportsSupplementsCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        WebElementsAssertion.validateTheCurrentUrlContainsString(sportsSupplementsCategoryPage.sportSupplementsUrl,webDriver);
    }
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:Sports Supplements Category- Make sure clicking on the Sports Supplements Category from HomePage Redirect User To CorrectURL", priority = 4)
    public void verifyClickingOnSportsSupplementsCategoryFromHomePageRedirectUserToCorrectURL() {
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage= new SportsSupplementsCategoryPage(webDriver);
        HomePage homePage= new HomePage(webDriver);
        homePage.navigateToHomePage();
        DataHelperAndWait.clickOnElement(homePage.getSportsSupplementsCategory(),webDriver);
        WebElementsAssertion.validateTheCurrentUrlContainsString(sportsSupplementsCategoryPage.sportSupplementsUrl,webDriver);
    }
//    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}:Sports Supplements Category- Make sure the Horizontal Banners appear correctly", priority = 7)
//    public void verifyTheHorizontalBannersAppearCorrectlyInSportSupplementsLandingPage() {
//        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
////        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        for (int i = 0; i < aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsScreen().size(); i++) {
//            DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsScreen().get(i),webDriver);
//            Assert.assertTrue(aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsScreen().get(i).isDisplayed());
//        }
//    }
//
//    @Test(groups = {"All Smoke Testing Result","1.2 High Severity"},description = "{{CountryName}}:Sports Supplements Category- Make sure clicking on the Horizontal Banners works correctly ", priority = 8)
//    public void verifyClickingOnHorizontalBannersAppearingInSportSupplementsLandingPageOpensCorrectly() {
//        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
////        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsScreen().get(0),webDriver);
//        for (int i = 0; i < aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsScreen().size(); i++) {
//            DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsScreen().get(i),webDriver);
//            aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsScreen().get(i).click();
//            aeSportSupplementsCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
//            webDriver.navigate().back();
//        }
//    }
    //    @Test(groups = {"All Smoke Testing Result","1.4 Low Severity"},description = "{{CountryName}}:Sports Supplements Category- Make sure that the customer can navigate to the home page using the BreadCrumb ", priority = 9)
//    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumb() {
//        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
////        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        aeSportSupplementsCategoryPage.navigate();
//        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
//        Assert.assertEquals(webDriver.getCurrentUrl(), aeSportSupplementsCategoryPage.BaseURL +aeSiteURL);
//    }
//
//    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}:Sports Supplements Category Page- Make sure that the Result label and its value appear correctly ", priority = 10)
//    public void verifyResultFieldAndItsVaLueAppearInTheSportSupplementsCategoryPage() {
//        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
////        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        aeSportSupplementsCategoryPage.navigate();
//        SoftAssert sa = new SoftAssert();
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
//        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
//    }
    //    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}:Sports Supplements Category Page- Make sure that Sort By menu and its options appear correctly ", priority = 11)
//    public void verifySortByMenuAndItsOptionsAppearCorrectly() {
//        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
////        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
////        aeSportSupplementsCategoryPage.navigate();
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
//        ArrayList<String> expectedOption = new ArrayList<>() {{
//            add("Featured");
//            add("Name");
//            add("Best Selling");
//            add("Price Min-Max");
//            add("Price Max-Min");
//        }};
//        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
//        List<WebElement> options = select.getOptions();
//        for (int i = 0; i < options.size(); i++) {
//            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
//        }
//    }
    //    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}:Sports Supplements Category- Make sure each of the Sport Supplements category image and Horizontal Banners appearing after sorting the products  ", priority = 13)
//    public void verifySportSupplementsCategoryImageAndHorizontalBannersAppearingAfterSortingTheProducts() {
//        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
////        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
////        aeSportSupplementsCategoryPage.navigate();
//        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
//        select.selectByVisibleText("Price Min-Max");
//        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(),webDriver);
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsSection().isDisplayed(),"The Horizontal Banners is missing after sorting the products ");
//    }
    //    @Test(groups = { "1.4 Low Severity"},description = "{{CountryName}}:Sports Supplements Category- Make sure  the Sport Supplements footer appears correctly  ", priority = 17)
//    public void verifySportSupplementsFooterSectionAppearsCorrectly() {
//        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
////        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
////        aeSportSupplementsCategoryPage.navigate();
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsFooterSection().isDisplayed());
//        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsFooterSection().getCssValue("background"), "rgb(242, 242, 242) none repeat scroll 0% 0% / auto padding-box border-box");
//    }
    //    @Test(groups = { "1.2 High Severity"},description = "{{CountryName}}:Sports Supplements Category- Verify that the search button works correctly from the Sport Supplements category page", priority = 19)
//    public void verifySearchBtnWorksCorrectlyFromSportSupplementsCategoryPage() {
//        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
////        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
////        aeSportSupplementsCategoryPage.navigate();
//        productDetailsPage.searchForBundle();
//        productDetailsPage.getSearchBtn().click();
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
//        aeSportSupplementsCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
//    }
    //    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}:Sports Supplements Category- Verify that the previous page button is disable when the current page is page 1 ", priority = 20)
//    public void verifyThePreviousBtnIsDisableWhenDisplayPage1() {
//        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
////        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        aeSportSupplementsCategoryPage.navigate();
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());
//    }
//
//    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}:Sports Supplements Category- Make Sure the Pagination control works correctly", priority = 21)
//    public void verifyThePaginationControlWorksCorrectly() {
//        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
////        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        aeSportSupplementsCategoryPage.navigate();
//        aeSportSupplementsCategoryPage.navigateToPage2();
//        DataHelperAndWait.waitForUrlContains("p=2",webDriver);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//    }
//
//    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}:Sports Supplements Category- Make Sure the previous page button works correctly", priority = 22)
//    public void verifyPreviousPageBtnWorksCorrectly() {
//        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
//        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
//  }
//
//    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}:Sports Supplements Category- Make Sure the next page button works correctly", priority = 23)
//    public void verifyNextPageBtnWorksCorrectly() {
//        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
//        DataHelperAndWait.waitForUrlContains("p=2",webDriver);
//        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
//    }
    //    @Test(groups = { "1.4 Low Severity"},description = "{{CountryName}}:Sports Supplements Category- Make sure all secure tabs appears correctly(100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks)", priority = 25)
//    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInSportSupplementsCategoryPage(){
//        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomSection().isDisplayed());
//        for (int i = 0; i < aeSportSupplementsCategoryPage.getPageBottomBlocksList().size(); i++) {
//            Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
//            switch (i) {
//                case 0:
//                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
//                    Assert.assertEquals(aeSportSupplementsCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
//                case 1:
//                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
//                    Assert.assertEquals(aeSportSupplementsCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
//                case 2:
//                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
//                    Assert.assertEquals(aeSportSupplementsCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
//            }
//        }
//    }
    //    @Test(groups = { "1.4 Low Severity"},description = "{{CountryName}}:Sports Supplements Category- Make sure that the BreadCrumb appears correctly after sorting the product ", priority = 27)
//    public void verifyTheBreadCrumbAppearingCorrectlyAfterSortingTheProducts() {
//        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
////        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        aeSportSupplementsCategoryPage.navigate();
//        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
//        select.selectByIndex(1);
//        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getHomeBreadcrumbs(),webDriver);
//        Assert.assertTrue(aeSportSupplementsCategoryPage.getHomeBreadcrumbs().isDisplayed());
//    }
@Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}:Sports Supplements Category- Make sure ability to navigate to the home page by clicking on the sporter logo  ", priority = 36)
public void verifyAbilityToNavigateToHomePageByClickingOnSporterLogoFromPdp() throws IOException {
    SportsSupplementsCategoryPage sportsSupplementsCategoryPage= new SportsSupplementsCategoryPage(webDriver);
    HeaderSection headerSection= new HeaderSection(webDriver);
    HomePage homePage= new HomePage(webDriver);
    sportsSupplementsCategoryPage.clickOnSportsSupplementMainMenu();
    DataHelperAndWait.clickOnElement(headerSection.getSporterLogo(),webDriver);
    WebElementsAssertion.validateTheElementIsDisplayed(homePage.getVitaminsAndHealthCategory(),webDriver);
}
    //    @Test(groups = "All Smoke Testing Result",description = "{{CountryName}}:Sports Supplements Category- Make Sure the ability to access all pages inside Sport Supplements Category Page  ", priority = 26)
//    public void verifyAbilityToAccessAllPagesInsideSportSupplementsCategoryPage(){
//        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
////        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        aeSportSupplementsCategoryPage.navigate();
//        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
//        if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
//            System.out.println("There's no pages");
//        else {
//            DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList, aeSportSupplementsCategoryPage.getNextPageBtn(), webDriver);
//        }}
}
