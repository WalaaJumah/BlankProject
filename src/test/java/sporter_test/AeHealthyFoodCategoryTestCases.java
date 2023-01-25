package sporter_test;

import core.BasePage;
import core.BaseTest;
import core.DataHelperAndWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sporter_pages.*;
import sporter_pages.productPage.ProductDetailsPage;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertFalse;

public class AeHealthyFoodCategoryTestCases extends BaseTest {
    private ProductDetailsPage productDetailsPage;
    private AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage;
    private AEGuestUserPage aeGuestUserPage;
    private Actions action;


    @Test(groups = "All Smoke Testing Result",description = "Healthy Food Category- Switching to UAE store", priority = 1)
    public void switchToUaeStore(){
        AeHealthyFoodCategoryPage aeHealthyFoodCategoryPage = new AeHealthyFoodCategoryPage(webDriver);
        aeHealthyFoodCategoryPage.switchToAECountry();
        if(webDriver.getCurrentUrl().contains(aeHealthyFoodCategoryPage.aeDomain)){
            System.out.println("You are in UAE Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+aeDomain);
            CloseInitialDialog();          }
    }

    @Test(groups = {"Healthy Food Category","All Smoke Testing Result","1.1 Critical Severity"},description = "Healthy Food Category- Make sure clicking on the Healthy Food Category Appears In MegaMenu Redirect User To CorrectURL", priority = 2)
    public void verifyClickingOnHealthyFoodCategoryAppearsInMegaMenuRedirectUserToCorrectURL() {
        AeHealthyFoodCategoryPage aeHealthyFoodCategoryPage = new AeHealthyFoodCategoryPage(webDriver);
        action = new Actions(webDriver);
        action.moveToElement(aeHealthyFoodCategoryPage.getHealthyFoodMainMenu()).perform();
        String expectedUrl=aeHealthyFoodCategoryPage.getHealthyFoodMainMenu().getAttribute("href");
        aeHealthyFoodCategoryPage.getHealthyFoodMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
        aeHealthyFoodCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Healthy Food Category","All Smoke Testing Result","1.1 Critical Severity"},description = "Healthy Food Category- Make sure clicking on the Healthy Food Category from ShopBy Menu Redirect User To CorrectURL", priority = 3)
    public void verifyClickingOnHealthyFoodCategoryFromShopByMenuRedirectUserToCorrectURL() {
        AeHealthyFoodCategoryPage aeHealthyFoodCategoryPage = new AeHealthyFoodCategoryPage(webDriver);
        action = new Actions(webDriver);
        action.moveToElement(aeHealthyFoodCategoryPage.getShopeByMenu()).perform();
        action.moveToElement(aeHealthyFoodCategoryPage.getHealthFoodOption()).perform();
        String expectedUrl=aeHealthyFoodCategoryPage.getHealthFoodOption().getAttribute("href");
        aeHealthyFoodCategoryPage.getHealthFoodOption().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
        aeHealthyFoodCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Healthy Food Category","All Smoke Testing Result","1.1 Critical Severity"},description = "Healthy Food Category- Make sure clicking on the Healthy Food Category from HomePage Redirect User To CorrectURL", priority =4)
    public void verifyClickingOnHealthyFoodCategoryFromHomePageRedirectUserToCorrectURL() {
        AeHealthyFoodCategoryPage aeHealthyFoodCategoryPage = new AeHealthyFoodCategoryPage(webDriver);
        aeHealthyFoodCategoryPage.navigateToHomePage();
        aeHealthyFoodCategoryPage.getHealthyFoodCategoryInHomePage().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),aeHealthyFoodCategoryPage.BaseURL +aeHealthyFoodCategoryPage.aeDomain+aeHealthyFoodCategoryPage.healthyFoodsUrl);
        aeHealthyFoodCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }
    @Test(groups = {"Healthy Food Category", "1.4 Low Severity"},description = "Healthy Food Category- Make sure the Horizontal Category Image appears correctly in the Healthy Food landing page ", priority = 5)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInHealthyFoodLandingPage() {
        AeHealthyFoodCategoryPage aeHealthyFoodCategoryPage = new AeHealthyFoodCategoryPage(webDriver);
        Assert.assertTrue(aeHealthyFoodCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(groups = {"Healthy Food Category", "1.4 Low Severity"},description = "Healthy Food Category- Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Healthy Food landing page ", priority = 6)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInHealthyFoodLandingPage() {
        AeHealthyFoodCategoryPage aeHealthyFoodCategoryPage = new AeHealthyFoodCategoryPage(webDriver);
        Assert.assertEquals(aeHealthyFoodCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Healthy Food", "Wrong title appears in the Healthy Food category image");
        Assert.assertEquals(aeHealthyFoodCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the Healthy Food category image");
    }
    @Test(groups = {"Healthy Food Category", "1.3 Medium Severity"},description = "Healthy Food Category- Make sure the Horizontal Banners appear correctly in the Healthy Food landing page ", priority = 7)
    public void verifyTheHorizontalBannersAppearCorrectlyInHealthyFoodLandingPage() {
        AeHealthyFoodCategoryPage aeHealthyFoodCategoryPage = new AeHealthyFoodCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        for (int i = 0; i < aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsScreen().size(); i++) {
            DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsScreen().get(i),webDriver);
            Assert.assertTrue(aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsScreen().get(i).isDisplayed());
        }
    }
    @Test(groups = {"Healthy Food Category", "1.1 Critical Severity"},description = "Healthy Food Category- Make sure clicking on the Horizontal Banners appearing in the Healthy Food landing page opens correctly ", priority = 8)
    public void verifyClickingOnHorizontalBannersAppearingInHealthyFoodLandingPageOpensCorrectly() {
        AeHealthyFoodCategoryPage aeHealthyFoodCategoryPage = new AeHealthyFoodCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        for (int i = 0; i < aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsScreen().size(); i++) {
            DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsScreen().get(i),webDriver);
            aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsScreen().get(i).click();
            aeHealthyFoodCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
            webDriver.navigate().back();
        }
    }
    @Test(groups = {"Healthy Food Category", "1.3 Medium Severity"},description = "Healthy Food Category- Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Healthy Food landing page ", priority = 9)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumb() {
        AeHealthyFoodCategoryPage aeHealthyFoodCategoryPage = new AeHealthyFoodCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), aeHealthyFoodCategoryPage.BaseURL +aeHealthyFoodCategoryPage.aeSiteURL);
    }
    @Test(groups = {"Healthy Food Category", "1.3 Medium Severity"},description = "Healthy Food Category- Make sure that the Result label and its value appear correctly in the Healthy Food Category page ", priority = 10)
    public void verifyResultFieldAndItsVaLueAppearInTheHealthyFoodCategoryPage() {
        AeHealthyFoodCategoryPage aeHealthyFoodCategoryPage = new AeHealthyFoodCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeHealthyFoodCategoryPage.navigate();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    @Test(groups = {"Healthy Food Category", "1.3 Medium Severity"},description = "Healthy Food Category- Make sure that Sort By menu and its options appear correctly ", priority = 11)
    public void verifySortByMenuAndItsOptionsAppearCorrectly() {
        AeHealthyFoodCategoryPage aeHealthyFoodCategoryPage = new AeHealthyFoodCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<>() {{
            add("Featured");
            add("Name");
            add("Best Selling");
            add("Newly added items");
            add("Price Min-Max");
            add("Price Max-Min");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
        }
    }
    @Test(groups = {"Healthy Food Category", "1.4 Low Severity"},description = "Healthy Food Category- Make sure that the Best Selling option is selected by default in the Sort By menu ", priority = 12)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenu() {
        AeHealthyFoodCategoryPage aeHealthyFoodCategoryPage = new AeHealthyFoodCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        try{
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
        }
        catch (AssertionError assertion){
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");

        }    }
//    //There's a bug here
    @Test(groups = {"Healthy Food Category", "1.2 High Severity"},description = "Healthy Food Category- Make sure each of the Healthy Food category image and Horizontal Banners appearing after sorting the products  ", priority = 13)
    public void verifyHealthyFoodCategoryImageAndHorizontalBannersAppearingAfterSortingTheProducts()  {
        AeHealthyFoodCategoryPage aeHealthyFoodCategoryPage = new AeHealthyFoodCategoryPage(webDriver);
        this.verifyClickingOnHealthyFoodCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        select.selectByVisibleText("Price Min-Max");
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(aeHealthyFoodCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(aeHealthyFoodCategoryPage.getMainBannersInTheSportSupplementsSection().isDisplayed());
    }
//    //There's a bug here
    @Test(groups = {"Healthy Food Category", "1.3 Medium Severity"},description = "Healthy Food Category- Make sure Sort By Menu appears correctly in the page after sorting By Featured  ", priority = 14)
    public void verifySortByMenuAppearingAfterSortingByRelevance() {
        AeHealthyFoodCategoryPage aeHealthyFoodCategoryPage = new AeHealthyFoodCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeHealthyFoodCategoryPage.navigate();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        select.selectByVisibleText("Featured");
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSortByMenu().isDisplayed());
    }
    @Test(groups = {"Healthy Food Category", "1.3 Medium Severity"},description = "Healthy Food Category- Make sure Sort By Menu appears correctly in the page after sorting By Product Name  ", priority = 15)
    public void verifySortByMenuAppearingAfterSortingByName() {
        AeHealthyFoodCategoryPage aeHealthyFoodCategoryPage = new AeHealthyFoodCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeHealthyFoodCategoryPage.navigate();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        select.selectByVisibleText("Name");
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSortByMenu().isDisplayed());
    }
    @Test(groups = {"Healthy Food Category", "1.3 Medium Severity"},description = "Healthy Food Category- Make sure Sort By Menu appears correctly in the page after sorting By Best Selling  ", priority = 16)
    public void verifySortByMenuAppearingAfterSortingByBestSelling(){
        AeHealthyFoodCategoryPage aeHealthyFoodCategoryPage = new AeHealthyFoodCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeHealthyFoodCategoryPage.navigate();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        select.selectByVisibleText("Best Selling");
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSortByMenu().isDisplayed());
    }
    @Test(groups = {"Healthy Food Category", "1.3 Medium Severity"},description = "Healthy Food Category- Make sure Sort By Menu appears correctly in the page after sorting By Price Min-Max  ", priority = 17)
    public void verifySortByMenuAppearingAfterSortingByPriceMinMax() {
        AeHealthyFoodCategoryPage aeHealthyFoodCategoryPage = new AeHealthyFoodCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeHealthyFoodCategoryPage.navigate();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        select.selectByVisibleText("Price Min-Max");
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSortByMenu().isDisplayed());
    }
    @Test(groups = {"Healthy Food Category", "1.3 Medium Severity"},description = "Healthy Food Category- Make sure Sort By Menu appears correctly in the page after sorting By Price Max-Min  ", priority = 18)
    public void verifySortByMenuAppearingAfterSortingByPriceMaxMin(){
        AeHealthyFoodCategoryPage aeHealthyFoodCategoryPage = new AeHealthyFoodCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeHealthyFoodCategoryPage.navigate();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        select.selectByVisibleText("Price Max-Min");
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSortByMenu().isDisplayed());
    }
    @Test(groups = {"Healthy Food Category", "1.3 Medium Severity"},description = "Healthy Food Category- Make sure that the BreadCrumb correctly after sorting the product ", priority = 19)
    public void verifyTheBreadCrumbAppearingCorrectlyAfterSortingTheProducts() {
        AeHealthyFoodCategoryPage aeHealthyFoodCategoryPage = new AeHealthyFoodCategoryPage(webDriver);
        aeHealthyFoodCategoryPage.navigate();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getHomeBreadcrumbs().isDisplayed());
    }
    @Test(groups = {"Healthy Food Category", "1.4 Low Severity"},description = "Healthy Food Category- Make sure  the Healthy Food footer appears correctly  ", priority = 20)
    public void verifySportSupplementsFooterSectionAppearsCorrectly() {
        AeHealthyFoodCategoryPage aeHealthyFoodCategoryPage = new AeHealthyFoodCategoryPage(webDriver);
        Assert.assertTrue(aeHealthyFoodCategoryPage.getSportSupplementsFooterSection().isDisplayed());
        Assert.assertEquals(aeHealthyFoodCategoryPage.getSportSupplementsFooterSection().getCssValue("background"), "rgb(242, 242, 242) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(groups = {"Healthy Food Category", "1.4 Low Severity"},description = "Healthy Food Category- Make sure the text appears in the Healthy Food footer appears correctly  ", priority = 21)
    public void verifyTheTextAppearInTheHealthyFoodFooterSectionAppearsCorrectly() {
        AeHealthyFoodCategoryPage aeHealthyFoodCategoryPage = new AeHealthyFoodCategoryPage(webDriver);
        aeHealthyFoodCategoryPage.navigate();
        Assert.assertEquals(aeHealthyFoodCategoryPage.getSportSupplementsTitleInFooterSection().getText(), "Healthy Food");
        Assert.assertTrue(aeHealthyFoodCategoryPage.getHealthyFoodDescriptionP1InFooterSection().getText().contains( "If you spend a lot of time researching, trying to eat healthy foods, have a dedicated diet or food restrictions, or consistently buy organic or non-GMO foods online, you probably" ));
    }
    @Test(groups = {"Healthy Food Category", "1.2 High Severity"},description = "Healthy Food Category- Verify that the search button works correctly from the Healthy Food category page", priority = 22)
    public void verifySearchBtnWorksCorrectlyFromHealthyFoodCategoryPage() {
        AeHealthyFoodCategoryPage aeHealthyFoodCategoryPage = new AeHealthyFoodCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.searchForBundle();
        productDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        aeHealthyFoodCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"Healthy Food Category", "1.3 Medium Severity"},description = "Healthy Food Category- Verify that the previous page button is disable when the current page is page 1 ", priority = 23)
    public void verifyThePreviousBtnIsDisableWhenDisplayPage1() {
        AeHealthyFoodCategoryPage aeHealthyFoodCategoryPage = new AeHealthyFoodCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeHealthyFoodCategoryPage.navigate();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());
    }
    @Test(groups = {"Healthy Food Category", "1.1 Critical Severity"},description = "Healthy Food Category- Make Sure the Pagination control works correctly", priority = 24)
    public void verifyThePaginationControlWorksCorrectly(){
        AeHealthyFoodCategoryPage aeHealthyFoodCategoryPage = new AeHealthyFoodCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Healthy Food Category", "1.3 Medium Severity"},description = "Healthy Food Category- Make Sure the previous page button works correctly", priority = 25)
    public void verifyPreviousPageBtnWorksCorrectly() {
        AeHealthyFoodCategoryPage aeHealthyFoodCategoryPage = new AeHealthyFoodCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Healthy Food Category", "1.3 Medium Severity"},description = "Healthy Food Category- Make Sure the next page button works correctly", priority = 26)
    public void verifyNextPageBtnWorksCorrectly(){
        AeHealthyFoodCategoryPage aeHealthyFoodCategoryPage = new AeHealthyFoodCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(groups = {"Healthy Food Category", "1.3 Medium Severity"},description = "Healthy Food Category- Make Sure the Filtration Section Appears Correctly", priority = 27)
    public void verifyAllSearchFieldsInsideFormFiltrationSectionAppearsCorrectly() {
        AeHealthyFoodCategoryPage aeHealthyFoodCategoryPage = new AeHealthyFoodCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeSportSupplementsCategoryPage.clickOnSeeAllBtnInFormSection();
        ArrayList<String> expectedFiltration = new ArrayList<>() {{
            add("Multi");
            add("Stew");
            add("Bars");
            add("Bites");
            add("Cakes & Brownies");
            add("Candies");
            add("Canned");
            add("Cereal");
            add("Cookies & Biscuits");
            add("Crisps");
            add("Dried");
            add("Effervescent");
            add("Fruit & Veg");
            add("Granulated");
            add("Gummies");
            add("Liquid");
            add("Nibs");
            add("Nuts");
            add("Popcorn");
            add("Powders");
            add("Sachet");
            add("Semi-Solid");
            add("Spray");
            add("Spread");
            add("Stick");
            add("Tablets");
            add("Tea Bags");
            add("Pods");
        }};
        for (int i = 0; i < aeSportSupplementsCategoryPage.getFormFiltrationSection().size(); i++) {
            DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getFormFiltrationSection().get(i),webDriver);
            Assert.assertTrue(aeSportSupplementsCategoryPage.getFormFiltrationSection().get(i).isDisplayed());
        }
    }
    @Test(groups = {"Healthy Food Category", "1.4 Low Severity"},description = "Healthy Food Category- Make sure all secure tabs appears correctly(100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks)", priority = 28)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInHealthyFoodCategoryPage(){
        AeHealthyFoodCategoryPage aeHealthyFoodCategoryPage = new AeHealthyFoodCategoryPage(webDriver);
        Assert.assertTrue(aeHealthyFoodCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeHealthyFoodCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeHealthyFoodCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertEquals(aeHealthyFoodCategoryPage.getSecurePaymentTitle().getText(), "100% Secure Payments");
                    Assert.assertEquals(aeHealthyFoodCategoryPage.getSecurePaymentDescription().getText(), "Secure checkout verified by Norton VeriSign.");
                case 1:
                    Assert.assertEquals(aeHealthyFoodCategoryPage.getAuthenticProductsTitle().getText(), "100% Authentic Products");
                    Assert.assertEquals(aeHealthyFoodCategoryPage.getAuthenticProductsDescription().getText(), "We only deal with original products");
                case 2:
                    Assert.assertEquals(aeHealthyFoodCategoryPage.getFastDeliveryTitle().getText(), "Fast Delivery Service");
                    Assert.assertEquals(aeHealthyFoodCategoryPage.getFastDeliveryDescription().getText(), "Fast delivery, competitive prices and excellent services");
            }
        }
    }
    //Pagination control for all pages in the Healthy Food Category Pages
    @Test(groups = {"Healthy Food Category","All Smoke Testing Result","1.3 Medium Severity"},description = "Healthy Food Category- Make Sure the ability to access all pages inside Healthy Food Category Page  ", priority = 29)
    public void verifyAbilityToAccessAllPagesInsideHealthyFoodCategoryPage(){
        AeHealthyFoodCategoryPage aeHealthyFoodCategoryPage = new AeHealthyFoodCategoryPage(webDriver);
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeHealthyFoodCategoryPage.navigate();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn(),webDriver);}
    //There's a bug here due to the BreadCrumb is missing after sorting the products

    @Test(groups = {"Healthy Food Category", "1.3 Medium Severity"},description = "Healthy Food Category- Make sure ability to navigate to the home page by clicking on the sporter logo  ", priority = 30)
    public void verifyAbilityToNavigateToHomePageByClickingOnSporterLogoFromCartPage() {
        AeHealthyFoodCategoryPage aeHealthyFoodCategoryPage = new AeHealthyFoodCategoryPage(webDriver);
        aeGuestUserPage = new AEGuestUserPage(webDriver);
        this.verifyClickingOnHealthyFoodCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeGuestUserPage.clickOnSporterLogo();
        Assert.assertEquals(webDriver.getCurrentUrl(), aeHealthyFoodCategoryPage.BaseURL +aeHealthyFoodCategoryPage.aeSiteURL," The Current URL is not matched with the Cart URL" );
    }
}
