/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_test.healthy_food_category_test_cases;

import core.BaseTest;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import sporter_pages.footerSections.FooterSection;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.healthy_food_pages.HealthyFoodPage;
import sporter_pages.homepage_classes.HomePage;
import sporter_pages.productPage.ProductDetailsPage;
import sporter_pages.sportsSupplementsCategoryPages.SportsSupplementsCategoryPage;

import java.io.IOException;

@Test(groups = "2.14 Healthy Food Category")

public class HealthyFoodTestCases extends BaseTest {
    String storeCountry;
    String countryCode;

    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}:Healthy Food Category- Make sure clicking on the Healthy Food Category Appears In MegaMenu Redirect User To CorrectURL", priority = 1)
    public void verifyClickingOnHealthyFoodCategoryAppearsInMegaMenuRedirectUserToCorrectURL() throws IOException {
        HealthyFoodPage healthyFoodPage = new HealthyFoodPage(webDriver);
        healthyFoodPage.clickOnHealthyFoodMainMenu();
        healthyFoodPage.verifyTheDisplayedPageDoesNotHaveErrors();
        WebElementsAssertion.validateTheCurrentUrlContainsString(healthyFoodPage.healthyFoodsUrl, webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Healthy Food Category- Make sure the Horizontal Banners appear correctly", priority = 2)
    public void verifyTheHorizontalBannersAppearCorrectlyInHealthyFoodLandingPage() throws IOException {
        HealthyFoodPage healthyFoodPage = new HealthyFoodPage(webDriver);
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        healthyFoodPage.navigateToHealthyFoodPage();
        for (int i = 1; i < sportsSupplementsCategoryPage.getMainBanners().size(); i++) {
            WebElementsAssertion.validateTheElementIsDisplayed(sportsSupplementsCategoryPage.getMainBanners().get(i), webDriver);
        }
    }
    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}:Healthy Food Category- Make sure  the Healthy Food footer appears correctly  ", priority = 3)
    public void verifyHealthyFoodFooterSectionAppearsCorrectly(){
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(sportsSupplementsCategoryPage.getMainFooter(), webDriver);
    }
    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}:Healthy Food Category Page- Make sure that Sort By menu appears correctly ", priority = 4)
    public void verifySortByMenuAndItsOptionsAppearCorrectly() {
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(sportsSupplementsCategoryPage.getSortByMenu(), webDriver);

    }
    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}:Healthy Food Category- Make sure all secure tabs appears correctly(100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks)", priority = 5)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInHealthyFoodCategoryPage(){
        FooterSection footerSection = new FooterSection(webDriver);
        for (int i = 0; i < footerSection.getPageBottomBlocksList().size(); i++) {
            WebElementsAssertion.validateTheElementIsDisplayed(footerSection.getPageBottomBlocksList().get(i), webDriver);
        }
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Healthy Food Category Page- Make sure that the Result label and its value appear correctly ", priority = 6)
    public void verifyResultFieldAndItsVaLueAppearInTheHealthyFoodCategoryPage(){
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(sportsSupplementsCategoryPage.getResultLabel(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(sportsSupplementsCategoryPage.getSearchResultValue(), webDriver);
        Assert.assertNotEquals(sportsSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero " + " The URL is: " + webDriver.getCurrentUrl());
    }
    //TODO:Needs to recheck
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Healthy Food Category- Make sure each of the Healthy Food category image and Horizontal Banners appearing after sorting the products  ", priority = 7)
    public void verifyHealthyFoodCategoryImageAndHorizontalBannersAppearingAfterSortingTheProducts(){
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        Select select = new Select(sportsSupplementsCategoryPage.getSortByMenu());
        select.getFirstSelectedOption();
        WebElementsAssertion.validateTheElementIsDisplayed(sportsSupplementsCategoryPage.getManinImage(), webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(sportsSupplementsCategoryPage.getMainBanners().get(0), webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Healthy Food Category- Make Sure the next page button works correctly", priority = 8)
    public void verifyNextPageBtnWorksCorrectly() {
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        if (sportsSupplementsCategoryPage.getPaginationBtns().size() > 3) {
            DataHelperAndWait.waitToBeClickable(sportsSupplementsCategoryPage.getNextPageBtn(), webDriver);
            DataHelperAndWait.JsExecutorToClickOnElement(sportsSupplementsCategoryPage.getNextPageBtn(), webDriver);
            WebElementsAssertion.validateTheCurrentUrlContainsString("p=2", webDriver);
        } else {
            System.out.println("There's only one page in the list");
        }
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Healthy Food Category- Make Sure the previous page button works correctly", priority = 9)
    public void verifyPreviousPageBtnWorksCorrectly() {
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        if (sportsSupplementsCategoryPage.getPaginationBtns().size() > 3) {
            DataHelperAndWait.waitToBeClickable(sportsSupplementsCategoryPage.getNextPageBtn(), webDriver);
            DataHelperAndWait.JsExecutorToClickOnElement(sportsSupplementsCategoryPage.getNextPageBtn(), webDriver);
            sportsSupplementsCategoryPage.waitTillLoaderComplete();
            DataHelperAndWait.waitToBeClickable(sportsSupplementsCategoryPage.getPreviousPageBtn(), webDriver);
            DataHelperAndWait.JsExecutorToClickOnElement(sportsSupplementsCategoryPage.getPreviousPageBtn(), webDriver);
            sportsSupplementsCategoryPage.waitTillLoaderComplete();
            WebElementsAssertion.validateTheCurrentUrlContainsString("p=2", webDriver);
        } else {
            System.out.println("There's only one page in the list");
        }
    }
    //TODO: Needs to recheck on KSA after solve the webelement ID in Arabic By Moamen
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Healthy Food Category- Make sure clicking on the Healthy Food Category from ShopBy Menu Redirect User To CorrectURL", priority = 10)
    public void verifyClickingOnHealthyFoodCategoryFromShopByMenuRedirectUserToCorrectURL() throws IOException {
        HealthyFoodPage healthyFoodPage = new HealthyFoodPage(webDriver);
        healthyFoodPage.clickOnHealthyFoodFromShopByMenu();
        healthyFoodPage.verifyTheDisplayedPageDoesNotHaveErrors();
        WebElementsAssertion.validateTheCurrentUrlContainsString(healthyFoodPage.healthyFoodsUrl, webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Healthy Food Category- Make sure that the BreadCrumb appears correctly after sorting the product ", priority = 11)
    public void verifyTheBreadCrumbAppearingCorrectlyAfterSortingTheProducts(){
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        DataHelperAndWait.waitToBeClickable(sportsSupplementsCategoryPage.getHomePageBreadCrumb(), webDriver);
        DataHelperAndWait.JsExecutorToClickOnElement(sportsSupplementsCategoryPage.getHomePageBreadCrumb(), webDriver);
        sportsSupplementsCategoryPage.waitTillLoaderComplete();
        WebElementsAssertion.validateTheElementIsDisplayed(sportsSupplementsCategoryPage.getSportsSupplementsCategoryFromHomePage(), webDriver);
    }
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Healthy Food Category- Make sure clicking on the Healthy Food Category from HomePage Redirect User To CorrectURL", priority = 12)
    public void verifyClickingOnHealthyFoodCategoryFromHomePageRedirectUserToCorrectURL() throws IOException {
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        HomePage homePage = new HomePage(webDriver);
        homePage.navigateToHomePage();
        DataHelperAndWait.clickOnElement(homePage.getHealthyFoodCategory(), webDriver);
        try {
            WebElementsAssertion.validateTheCurrentUrlContainsString(sportsSupplementsCategoryPage.healthyFoodsUrl, webDriver);
        }
        catch (Exception e){
            WebElementsAssertion.validateTheCurrentUrlContainsString(sportsSupplementsCategoryPage.healthyFoodsUrl, webDriver);
        }
    }
    
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Healthy Food Category- Make sure clicking on the Horizontal Banners works correctly ", priority = 13)
    public void verifyClickingOnHorizontalBannersAppearingInHealthyFoodLandingPageOpensCorrectly() throws IOException {
        HealthyFoodPage healthyFoodPage = new HealthyFoodPage(webDriver);
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        healthyFoodPage.navigateToHealthyFoodPage();
        for (int i = 0; i < sportsSupplementsCategoryPage.getMainBanners().size(); i++) {
            DataHelperAndWait.clickOnElement(sportsSupplementsCategoryPage.getMainBanners().get(i), webDriver);
            sportsSupplementsCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
            healthyFoodPage.navigateToHealthyFoodPage();
        }
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Healthy Food Category- Make sure that the customer can navigate to the home page using the BreadCrumb ", priority = 14)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumb() throws IOException {
        HealthyFoodPage healthyFoodPage = new HealthyFoodPage(webDriver);
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        healthyFoodPage.navigateToHealthyFoodPage();
        DataHelperAndWait.clickOnElement(sportsSupplementsCategoryPage.getHomePageBreadCrumb(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(sportsSupplementsCategoryPage.getSportsSupplementsCategoryFromHomePage(), webDriver);
    }


    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}:Healthy Food Category- Make sure the NewsLetter section appears correctly  ", priority = 15)
    public void verifyNewLetterSectionAppearsCorrectly() throws IOException {
        HealthyFoodPage healthyFoodPage = new HealthyFoodPage(webDriver);
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        healthyFoodPage.navigateToHealthyFoodPage();
        WebElementsAssertion.validateTheElementIsDisplayed(sportsSupplementsCategoryPage.getNewsLetterSection(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Healthy Food Category- Verify that the search button works correctly from the Healthy Food category page", priority = 16)
    public void verifySearchBtnWorksCorrectlyFromHealthyFoodCategoryPage() throws IOException {
        HealthyFoodPage healthyFoodPage = new HealthyFoodPage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        healthyFoodPage.navigateToHealthyFoodPage();
        DataHelperAndWait.typeTextInElement(productDetailsPage.getSearchField(),webDriver,"Basic");
        DataHelperAndWait.clickOnElement(productDetailsPage.getSearchBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getProductCard(),webDriver);
        productDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }






    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Healthy Food Category- Make sure ability to navigate to the home page by clicking on the sporter logo  ", priority = 17)
    public void verifyAbilityToNavigateToHomePageByClickingOnSporterLogoFromPdp() throws IOException {
        HealthyFoodPage healthyFoodPage = new HealthyFoodPage(webDriver);
        HeaderSection headerSection = new HeaderSection(webDriver);
        HomePage homePage = new HomePage(webDriver);
        healthyFoodPage.navigateToHealthyFoodPage();
        DataHelperAndWait.clickOnElement(headerSection.getSporterLogo(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getVitaminsAndHealthCategory(), webDriver);
    }

    @Test(groups = "1.3 Medium Severity", description = "{{CountryName}}:Healthy Food Category- Make Sure the ability to access all pages inside Healthy Food Category Page  ", priority = 18)
    public void verifyAbilityToAccessAllPagesInsideHealthyFoodCategoryPage() throws IOException {
        HealthyFoodPage healthyFoodPage = new HealthyFoodPage(webDriver);
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        healthyFoodPage.navigateToHealthyFoodPage();
        DataHelperAndWait.waitToBeVisible(sportsSupplementsCategoryPage.getSearchResultValue(), webDriver);
        String numberOfProductInTheList = sportsSupplementsCategoryPage.getSearchResultValue().getText();
        if (sportsSupplementsCategoryPage.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else {
            sportsSupplementsCategoryPage.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList, sportsSupplementsCategoryPage.getNextPageBtn(), webDriver);
        }

    }
}
