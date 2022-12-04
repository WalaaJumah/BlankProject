package sporter_test;

import core.BaseTest;
import core.DataHelperAndWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sporter_pages.AEGuestUserPage;
import sporter_pages.AeHealthyFoodCategoryPage;
import sporter_pages.AeProductDetailsPage;
import sporter_pages.AeSportSupplementsCategoryPage;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertFalse;

public class AeHealthyFoodCategoryTestCases extends BaseTest {
    private AEMegaMenuTestCases aeMegaMenuTestCases;
    private AeProductDetailsPage aeProductDetailsPage;
    private AeHealthyFoodCategoryPage aeHealthyFoodCategoryPage;
    private AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage;
    private AEFooterPageTestCases aeFooterPageTestCases;
    private AEGuestUserPage aeGuestUserPage;

    @Test(description = "Make sure clicking on the Healthy Food Category Appears In MegaMenu Redirect User To CorrectURL", priority = 1)
    public void verifyClickingOnHealthyFoodCategoryAppearsInMegaMenuRedirectUserToCorrectURL() {
        aeMegaMenuTestCases = new AEMegaMenuTestCases();
        aeMegaMenuTestCases.verifyClickingOnHealthyFoodMainMenuRedirectUserToCorrectURL();
    }
    @Test(description = "Make sure clicking on the Healthy Food Category from ShopBy Menu Redirect User To CorrectURL", priority = 2)
    public void verifyClickingOnHealthyFoodCategoryFromShopByMenuRedirectUserToCorrectURL() {
        aeMegaMenuTestCases = new AEMegaMenuTestCases();
        aeMegaMenuTestCases.verifyClickingOnHealthyFoodOptionInsideShopByMenuRedirectUserToCorrectURL();
    }
    @Test(description = "Make sure clicking on the Healthy Food Category from HomePage Redirect User To CorrectURL", priority = 3)
    public void verifyClickingOnHealthyFoodCategoryFromHomePageRedirectUserToCorrectURL() {
        aeHealthyFoodCategoryPage = new AeHealthyFoodCategoryPage(webDriver);
        aeMegaMenuTestCases = new AEMegaMenuTestCases();
        aeHealthyFoodCategoryPage.switchToAeCountry();
        DataHelperAndWait.waitToBeClickable(aeHealthyFoodCategoryPage.getHealthyFoodCategoryInHomePage(), 5);
        aeHealthyFoodCategoryPage.getHealthyFoodCategoryInHomePage().click();
        Assert.assertEquals(webDriver.getCurrentUrl(),siteURL+aeMegaMenuTestCases.healthyFoodsUrl);
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Make sure the Horizontal Category Image appears correctly in the Healthy Food landing page ", priority = 4)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInHealthyFoodLandingPage() {
        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHealthyFoodCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(description = "Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the Healthy Food landing page ", priority = 5)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInHealthyFoodLandingPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHealthyFoodCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 5);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 5);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Healthy Food", "Wrong title appears in the Healthy Food category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the Healthy Food category image");
    }
    @Test(description = "Make sure the Horizontal Banners appear correctly in the Healthy Food landing page ", priority = 6)
    public void verifyTheHorizontalBannersAppearCorrectlyInHealthyFoodLandingPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHealthyFoodCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        DataHelperAndWait.implicitWait(5);
        for (int i = 0; i < aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsScreen().size(); i++) {
            Assert.assertTrue(aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsScreen().get(i).isDisplayed());
        }
    }
    @Test(description = "Make sure clicking on the Horizontal Banners appearing in the Healthy Food landing page opens correctly ", priority = 7)
    public void verifyClickingOnHorizontalBannersAppearingInHealthyFoodLandingPageOpensCorrectly() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHealthyFoodCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        DataHelperAndWait.implicitWait(5);
        for (int i = 0; i < aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsScreen().size(); i++) {
            aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsScreen().get(i).click();
            boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
            assertFalse(verifyTitle, "Page Not Found Is Displayed");
            boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
            assertFalse(isTheElementPresent, "The page is empty");
            webDriver.navigate().back();
        }
    }
    @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the Healthy Food landing page ", priority = 8)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumb() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHealthyFoodCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL);
    }
    @Test(description = "Make sure that the Result label and its value appear correctly in the Healthy Food Category page ", priority = 9)
    public void verifyResultFieldAndItsVaLueAppearInTheHealthyFoodCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHealthyFoodCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }
    @Test(description = "Make sure that Sort By menu and its options appear correctly ", priority = 10)
    public void verifySortByMenuAndItsOptionsAppearCorrectly() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHealthyFoodCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<String>() {{
            add("Relevance");
            add("Name");
            add("Best Selling");
            add("Price Min-Max");
            add("Price Max-Min");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
        }
    }
    @Test(description = "Make sure that the Best Selling option is selected by default in the Sort By menu ", priority = 11)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenu() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHealthyFoodCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
    }
    //There's a bug here
    @Test(description = "Make sure each of the Healthy Food category image and Horizontal Banners appearing after sorting the products  ", priority = 12)
    public void verifyHealthyFoodCategoryImageAndHorizontalBannersAppearingAfterSortingTheProducts() throws InterruptedException {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHealthyFoodCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        select.selectByVisibleText("Relevance");
        DataHelperAndWait.waitForTime(3000);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 5);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsSection().isDisplayed());
    }
    //There's a bug here
    @Test(description = "Make sure Sort By Menu appears correctly in the page after sorting By Relevance  ", priority = 13)
    public void verifySortByMenuAppearingAfterSortingByRelevance() throws InterruptedException {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHealthyFoodCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        select.selectByVisibleText("Relevance");
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSortByMenu().isDisplayed());
    }
    @Test(description = "Make sure Sort By Menu appears correctly in the page after sorting By Name  ", priority = 14)
    public void verifySortByMenuAppearingAfterSortingByName() throws InterruptedException {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHealthyFoodCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        select.selectByVisibleText("Name");
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSortByMenu().isDisplayed());
    }
    @Test(description = "Make sure Sort By Menu appears correctly in the page after sorting By Best Selling  ", priority = 15)
    public void verifySortByMenuAppearingAfterSortingByBestSelling() throws InterruptedException {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHealthyFoodCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        select.selectByVisibleText("Best Selling");
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSortByMenu().isDisplayed());
    }
    @Test(description = "Make sure Sort By Menu appears correctly in the page after sorting By Price Min-Max  ", priority = 16)
    public void verifySortByMenuAppearingAfterSortingByPriceMinMax() throws InterruptedException {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHealthyFoodCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        select.selectByVisibleText("Price Min-Max");
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSortByMenu().isDisplayed());
    }
    @Test(description = "Make sure Sort By Menu appears correctly in the page after sorting By Price Max-Min  ", priority = 17)
    public void verifySortByMenuAppearingAfterSortingByPriceMaxMin() throws InterruptedException {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHealthyFoodCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        select.selectByVisibleText("Price Max-Min");
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSortByMenu().isDisplayed());
    }
    @Test(description = "Make sure  the Healthy Food footer appears correctly  ", priority = 18)
    public void verifySportSupplementsFooterSectionAppearsCorrectly() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHealthyFoodCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsFooterSection().isDisplayed());
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsFooterSection().getCssValue("background"), "rgb(242, 242, 242) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(description = "Make sure the text appears in the Healthy Food footer appears correctly  ", priority = 19)
    public void verifyTheTextAppearInTheHealthyFoodFooterSectionAppearsCorrectly() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeHealthyFoodCategoryPage= new AeHealthyFoodCategoryPage(webDriver);
        this.verifyClickingOnHealthyFoodCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInFooterSection().getText(), "Healthy Food");
        Assert.assertEquals(aeHealthyFoodCategoryPage.getHealthyFoodDescriptionP1InFooterSection().getText()+aeHealthyFoodCategoryPage.getHealthyFoodDescriptionP2InFooterSection().getText()+aeHealthyFoodCategoryPage.getHealthyFoodDescriptionP3InFooterSection().getText()+aeHealthyFoodCategoryPage.getHealthyFoodDescriptionP4InFooterSection().getText(), "If you spend a lot of time researching, trying to eat healthy foods, have a dedicated diet or food restrictions, or consistently buy organic or non-GMO foods online, you probably know how hard it is to find what you need or at least to find it in one place.Although it has become much easier to find healthy foods in regular grocery stores, the options are still limited, particularly if you want to buy 100 percent healthy foods and organic products for your entire home. Even if there is a dedicated healthy food store in your area, Sporter can fill the gaps that your local store doesn’t, or if you were looking for a certain brand that you like the most.\n" +
                "\n" +
                "Eating right and finding healthy foods online can be tough too, so we are here to help and make it easy with our high-quality collection of delicious, healthy food products. We offer responsible and nutrient-rich choices, including rice, oats, milk, natural food and sports snacks, detox teas, spices, gluten free baking products and more, so you can get the most out of your diet every day. Sporter is also great when you need dairy-free, soy-free, vegan, vegetarian, or gluten-free foods. No need to stand in an aisle to read the list of ingredients on your breakfast cereal, since you can click a button to see all the items that fit your criteria.You can shop healthy foods online any time of the day that works best for you, instead of fighting the crowds or trying to get to the grocery store before it closes.\n" +
                "Our products make your meals tastier and healthier in simple preparations. Our healthy products are loved by children and adults alike, which helps you prepare the best meal for the whole family. So buy branded and packaged food from our online store from the comfort of your homes and enjoy great recipes at a great price.");
    }
    @Test(description = "Verify that the search button works correctly from the Healthy Food category page", priority = 20)
    public void verifySearchBtnWorksCorrectlyFromHealthyFoodCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
        this.verifyClickingOnHealthyFoodCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Verify that the previous page button is disable when the current page is page 1 ", priority = 21)
    public void verifyThePreviousBtnIsDisableWhenDisplayPage1() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHealthyFoodCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());
    }
    @Test(description = "Make Sure the Pagination control works correctly", priority = 22)
    public void verifyThePagenationControlWorksCorrectly() throws InterruptedException {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHealthyFoodCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(description = "Make Sure the previous page button works correctly", priority = 23)
    public void verifyPreviousPageBtnWorksCorrectly() throws InterruptedException {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyThePagenationControlWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(description = "Make Sure the next page button works correctly", priority = 24)
    public void verifyNextPageBtnWorksCorrectly() throws InterruptedException {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyThePagenationControlWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }
    @Test(description = "Make Sure All Search Fields Inside Form Filtration Section Appears Correctly", priority = 25)
    public void verifyAllSearchFieldsInsideFormFiltrationSectionAppearsCorrectly() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHealthyFoodCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeSportSupplementsCategoryPage.clickOnSeeAllBtnInFormSection();
        ArrayList<String> expectedFiltration = new ArrayList<String>() {{
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
            System.out.println(aeSportSupplementsCategoryPage.getFormFiltrationSection().get(i).getText());
            Assert.assertEquals(aeSportSupplementsCategoryPage.getFormFiltrationSection().get(i).getText(), expectedFiltration.get(i));
        }
    }
    @Test(description = "Make sure the page bottom that appears in the footer section displays all 3 blocks:100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks in the Healthy Food category page", priority = 26)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInHealthyFoodCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeFooterPageTestCases= new AEFooterPageTestCases();
        this.verifyClickingOnHealthyFoodCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeFooterPageTestCases.verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectly();
    }
    //Pagination control for all pages in the Healthy Food Category Pages
    @Test(description = "Make Sure the ability to access all pages inside Healthy Food Category Page  ", priority = 27)
    public void verifyAbilityToAccessAllPagesInsideHealthyFoodCategoryPage(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHealthyFoodCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList,aeSportSupplementsCategoryPage.getNextPageBtn());}
    //There's a bug here due to the BreadCrumb is missing after sorting the products
    @Test(description = "Make sure that the BreadCrumb correctly after sorting the product ", priority = 28)
    public void verifyTheBreadCrumbAppearingCorrectlyAfterSortingTheProducts() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnHealthyFoodCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        select.selectByIndex(1);
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getHomeBreadcrumbs().isDisplayed());
    }
    @Test(description = "Make sure ability to navigate to the home page by clicking on the sporter logo  ", priority = 29)
    public void verifyAbilityToNavigateToHomePageByClickingOnSporterLogoFromCartPage() {
        aeGuestUserPage = new AEGuestUserPage(webDriver);
        this.verifyClickingOnHealthyFoodCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeGuestUserPage.clickOnSporterLogo();
        Assert.assertEquals(webDriver.getCurrentUrl(), siteURL+aeSiteURL," The Current URL is not matched with the Cart URL" );
    }
}
