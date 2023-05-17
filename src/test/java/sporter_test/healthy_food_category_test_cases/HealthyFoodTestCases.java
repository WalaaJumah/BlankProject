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

    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}:Healthy Food Category- Make sure clicking on the Healthy Food Category Appears In MegaMenu Redirect User To CorrectURL", priority = 2)
    public void verifyClickingOnHealthyFoodCategoryAppearsInMegaMenuRedirectUserToCorrectURL() throws IOException {
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        HealthyFoodPage healthyFoodPage = new HealthyFoodPage(webDriver);
        healthyFoodPage.clickOnHealthyFoodMainMenu();
        sportsSupplementsCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        WebElementsAssertion.validateTheCurrentUrlContainsString(healthyFoodPage.healthyFoodsUrl, webDriver);
    }

    //TODO: Needs to recheck on KSA after solve the webelement ID in Arabic By Moamen
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Healthy Food Category- Make sure clicking on the Healthy Food Category from ShopBy Menu Redirect User To CorrectURL", priority = 3)
    public void verifyClickingOnHealthyFoodCategoryFromShopByMenuRedirectUserToCorrectURL() throws IOException {
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        HealthyFoodPage healthyFoodPage = new HealthyFoodPage(webDriver);
        healthyFoodPage.clickOnHealthyFoodFromShopByMenu();
        sportsSupplementsCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
        WebElementsAssertion.validateTheCurrentUrlContainsString(sportsSupplementsCategoryPage.healthyFoodsUrl, webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Healthy Food Category- Make sure clicking on the Healthy Food Category from HomePage Redirect User To CorrectURL", priority = 4)
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

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Healthy Food Category- Make sure the Horizontal Banners appear correctly", priority = 5)
    public void verifyTheHorizontalBannersAppearCorrectlyInHealthyFoodLandingPage() throws IOException {
        HealthyFoodPage healthyFoodPage = new HealthyFoodPage(webDriver);
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        healthyFoodPage.navigateToHealthyFoodPage();
        for (int i = 1; i < sportsSupplementsCategoryPage.getMainBanners().size(); i++) {
            WebElementsAssertion.validateTheElementIsDisplayed(sportsSupplementsCategoryPage.getMainBanners().get(i), webDriver);
        }
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Healthy Food Category- Make sure clicking on the Horizontal Banners works correctly ", priority = 6)
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

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Healthy Food Category- Make sure that the customer can navigate to the home page using the BreadCrumb ", priority = 7)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumb() throws IOException {
        HealthyFoodPage healthyFoodPage = new HealthyFoodPage(webDriver);
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        healthyFoodPage.navigateToHealthyFoodPage();
        HomePage homePage = new HomePage(webDriver);
        DataHelperAndWait.clickOnElement(sportsSupplementsCategoryPage.getHomePageBreadCrumb(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getSportsSupplementsCategory(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Healthy Food Category Page- Make sure that the Result label and its value appear correctly ", priority = 8)
    public void verifyResultFieldAndItsVaLueAppearInTheHealthyFoodCategoryPage() throws IOException {
        HealthyFoodPage healthyFoodPage = new HealthyFoodPage(webDriver);
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        healthyFoodPage.navigateToHealthyFoodPage();
        WebElementsAssertion.validateTheElementIsDisplayed(sportsSupplementsCategoryPage.getResultLabel(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(sportsSupplementsCategoryPage.getSearchResultValue(), webDriver);
        Assert.assertNotEquals(sportsSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero " + " The URL is: " + webDriver.getCurrentUrl());
    }

    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}:Healthy Food Category Page- Make sure that Sort By menu appears correctly ", priority = 9)
    public void verifySortByMenuAndItsOptionsAppearCorrectly() throws IOException {
        HealthyFoodPage healthyFoodPage = new HealthyFoodPage(webDriver);
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        healthyFoodPage.navigateToHealthyFoodPage();
        WebElementsAssertion.validateTheElementIsDisplayed(sportsSupplementsCategoryPage.getSortByMenu(), webDriver);

    }
//TODO:Needs to recheck
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Healthy Food Category- Make sure each of the Healthy Food category image and Horizontal Banners appearing after sorting the products  ", priority = 10)
    public void verifyHealthyFoodCategoryImageAndHorizontalBannersAppearingAfterSortingTheProducts() throws IOException {
        HealthyFoodPage healthyFoodPage = new HealthyFoodPage(webDriver);
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        healthyFoodPage.navigateToHealthyFoodPage();
        Select select = new Select(sportsSupplementsCategoryPage.getSortByMenu());
        select.getFirstSelectedOption();
        WebElementsAssertion.validateTheElementIsDisplayed(sportsSupplementsCategoryPage.getManinImage(), webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(sportsSupplementsCategoryPage.getMainBanners().get(0), webDriver);
    }

    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}:Healthy Food Category- Make sure  the Healthy Food footer appears correctly  ", priority = 11)
    public void verifyHealthyFoodFooterSectionAppearsCorrectly() throws IOException {
        HealthyFoodPage healthyFoodPage = new HealthyFoodPage(webDriver);
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        healthyFoodPage.navigateToHealthyFoodPage();
        WebElementsAssertion.validateTheElementIsDisplayed(sportsSupplementsCategoryPage.getMainFooter(), webDriver);
    }

    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}:Healthy Food Category- Make sure the NewsLetter section appears correctly  ", priority = 12)
    public void verifyNewLetterSectionAppearsCorrectly() throws IOException {
        HealthyFoodPage healthyFoodPage = new HealthyFoodPage(webDriver);
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        healthyFoodPage.navigateToHealthyFoodPage();
        WebElementsAssertion.validateTheElementIsDisplayed(sportsSupplementsCategoryPage.getNewsLetterSection(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Healthy Food Category- Verify that the search button works correctly from the Healthy Food category page", priority = 13)
    public void verifySearchBtnWorksCorrectlyFromHealthyFoodCategoryPage() throws IOException {
        HealthyFoodPage healthyFoodPage = new HealthyFoodPage(webDriver);
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        healthyFoodPage.navigateToHealthyFoodPage();
        DataHelperAndWait.typeTextInElement(productDetailsPage.getSearchField(),webDriver,"Basic");
        DataHelperAndWait.clickOnElement(productDetailsPage.getSearchBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(productDetailsPage.getProductCard(),webDriver);
        productDetailsPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Healthy Food Category- Make Sure the next page button works correctly", priority = 14)
    public void verifyNextPageBtnWorksCorrectly() throws IOException {
        HealthyFoodPage healthyFoodPage = new HealthyFoodPage(webDriver);
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        healthyFoodPage.navigateToHealthyFoodPage();
        if (sportsSupplementsCategoryPage.getPaginationBtns().size() > 3) {
            DataHelperAndWait.clickOnElement(sportsSupplementsCategoryPage.getNextPageBtn(), webDriver);
            WebElementsAssertion.validateTheCurrentUrlContainsString("p=2", webDriver);
        } else {
            System.out.println("There's only one page in the list");
        }
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Healthy Food Category- Make Sure the previous page button works correctly", priority = 15)
    public void verifyPreviousPageBtnWorksCorrectly() throws IOException {
        HealthyFoodPage healthyFoodPage = new HealthyFoodPage(webDriver);
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        healthyFoodPage.navigateToHealthyFoodPage();
        if (sportsSupplementsCategoryPage.getPaginationBtns().size() > 3) {
            DataHelperAndWait.clickOnElement(sportsSupplementsCategoryPage.getNextPageBtn(), webDriver);
            DataHelperAndWait.waitForTime(2000);
            DataHelperAndWait.waitForUrlContains("p=2",webDriver);
            DataHelperAndWait.clickOnElement(sportsSupplementsCategoryPage.getPreviousPageBtn(), webDriver);
            DataHelperAndWait.waitForTime(2000);
            Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
        } else {
            System.out.println("There's only one page in the list");
        }
    }

    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}:Healthy Food Category- Make sure all secure tabs appears correctly(100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks)", priority = 16)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInHealthyFoodCategoryPage() throws IOException {
        HealthyFoodPage healthyFoodPage = new HealthyFoodPage(webDriver);
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        FooterSection footerSection = new FooterSection(webDriver);
        healthyFoodPage.navigateToHealthyFoodPage();
        for (int i = 0; i < footerSection.getPageBottomBlocksList().size(); i++) {
            WebElementsAssertion.validateTheElementIsDisplayed(footerSection.getPageBottomBlocksList().get(i), webDriver);
        }
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
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Healthy Food Category- Make sure that the BreadCrumb appears correctly after sorting the product ", priority = 17)
    public void verifyTheBreadCrumbAppearingCorrectlyAfterSortingTheProducts() throws IOException {
        HealthyFoodPage healthyFoodPage = new HealthyFoodPage(webDriver);
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        HomePage homePage = new HomePage(webDriver);
        healthyFoodPage.navigateToHealthyFoodPage();
        DataHelperAndWait.clickOnElement(sportsSupplementsCategoryPage.getHomePageBreadCrumb(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getSportsSupplementsCategory(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:Healthy Food Category- Make sure ability to navigate to the home page by clicking on the sporter logo  ", priority = 18)
    public void verifyAbilityToNavigateToHomePageByClickingOnSporterLogoFromPdp() throws IOException {
        HealthyFoodPage healthyFoodPage = new HealthyFoodPage(webDriver);
        SportsSupplementsCategoryPage sportsSupplementsCategoryPage = new SportsSupplementsCategoryPage(webDriver);
        HeaderSection headerSection = new HeaderSection(webDriver);
        HomePage homePage = new HomePage(webDriver);
        healthyFoodPage.navigateToHealthyFoodPage();
        DataHelperAndWait.clickOnElement(headerSection.getSporterLogo(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getVitaminsAndHealthCategory(), webDriver);
    }

    @Test(groups = "1.3 Medium Severity", description = "{{CountryName}}:Healthy Food Category- Make Sure the ability to access all pages inside Healthy Food Category Page  ", priority = 19)
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
