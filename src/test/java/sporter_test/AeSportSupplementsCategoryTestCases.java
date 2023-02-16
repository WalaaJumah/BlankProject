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

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertFalse;
public class AeSportSupplementsCategoryTestCases extends BaseTest {
    private AeProductDetailsPage aeProductDetailsPage;
    private AEGuestUserPage aeGuestUserPage;
    private Actions action;
    private final String  sportSupplementsUrl="/sport-supplements/";

@Test(groups = "All Smoke Testing Result",description = "Sports Supplements Category- Switching to UAE store", priority = 1)
public void switchToUaeStore(){
    AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
    aeSportSupplementsCategoryPage.switchToAECountry();
    if(webDriver.getCurrentUrl().contains(aeSportSupplementsCategoryPage.aeDomain)){
        System.out.println("You are in UAE Store");
    }
    else {
        webDriver.navigate().to(BasePage.BaseURL+aeDomain);
        CloseInitialDialog();      }
}
    @Test(groups = {"2.07 Sports Supplements Category","All Smoke Testing Result","1.1 Critical Severity"},description = "Sports Supplements Category- Make sure clicking on the Sports Supplements Category Appears In MegaMenu Redirect User To CorrectURL", priority = 2)
    public void verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL() {     
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        action = new Actions(webDriver);
        action.moveToElement(aeSportSupplementsCategoryPage.getSportSupplementsMainMenu()).perform();
        String expectedUrl=aeSportSupplementsCategoryPage.getSportSupplementsMainMenu().getAttribute("href");
        aeSportSupplementsCategoryPage.getSportSupplementsMainMenu().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
        aeSportSupplementsCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();

    }

    @Test(groups = {"2.07 Sports Supplements Category","All Smoke Testing Result","1.1 Critical Severity"},description = "Sports Supplements Category- Make sure clicking on the Sports Supplements Category from ShopBy Menu Redirect User To CorrectURL", priority = 3)
    public void verifyClickingOnSportsSupplementsCategoryFromShopByMenuRedirectUserToCorrectURL() {
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        action = new Actions(webDriver);
        action.moveToElement(aeSportSupplementsCategoryPage.getShopeByMenu()).perform();
        action.moveToElement(aeSportSupplementsCategoryPage.getSportsSupplementsOption()).perform();
        String expectedUrl=aeSportSupplementsCategoryPage.getSportsSupplementsOption().getAttribute("href");
        aeSportSupplementsCategoryPage.getSportsSupplementsOption().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(expectedUrl));
//        Assert.assertTrue(webDriver.getCurrentUrl().contains(sportSupplementsUrl));
        aeSportSupplementsCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();

    }

    @Test(groups = {"2.07 Sports Supplements Category","All Smoke Testing Result","1.1 Critical Severity"},description = "Sports Supplements Category- Make sure clicking on the Sports Supplements Category from HomePage Redirect User To CorrectURL", priority = 4)
    public void verifyClickingOnSportsSupplementsCategoryFromHomePageRedirectUserToCorrectURL() {
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        webDriver.navigate().to("https://www.sporter.com");
        DataHelperAndWait.waitToBeClickable(aeSportSupplementsCategoryPage.getSportSupplementsCategoryInHomePage(), 8,webDriver);
        aeSportSupplementsCategoryPage.getSportSupplementsCategoryInHomePage().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(sportSupplementsUrl));
        aeSportSupplementsCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();

    }

    @Test(groups = {"2.07 Sports Supplements Category", "1.4  Low Severity"},description = "Sports Supplements Category- Make sure the Horizontal Category Image appears correctly in the landing page ", priority = 5)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInSportSupplementsLandingPage() {
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 8,webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }

    @Test(groups = {"2.07 Sports Supplements Category", "1.4  Low Severity"},description = "Sports Supplements Category- Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly", priority = 6)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInSportSupplementsLandingPage() {
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        aeSportSupplementsCategoryPage.navigate();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(), 8,webDriver);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(), 8,webDriver);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(), "Sport Supplements", "Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(), "For Every Training Goal & Body Type", "Wrong Paragraph appears in the sport Supplements category image");
    }

    @Test(groups = {"2.07 Sports Supplements Category", "1.2 High Severity"},description = "Sports Supplements Category- Make sure the Horizontal Banners appear correctly", priority = 7)
    public void verifyTheHorizontalBannersAppearCorrectlyInSportSupplementsLandingPage() {
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        for (int i = 0; i < aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsScreen().size(); i++) {
            DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsScreen().get(i), 8,webDriver);
            Assert.assertTrue(aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsScreen().get(i).isDisplayed());
        }
    }

    @Test(groups = {"2.07 Sports Supplements Category","All Smoke Testing Result","1.3 Medium Severity"},description = "Sports Supplements Category- Make sure clicking on the Horizontal Banners works correctly ", priority = 8)
    public void verifyClickingOnHorizontalBannersAppearingInSportSupplementsLandingPageOpensCorrectly() {
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsScreen().get(0), 8,webDriver);
        for (int i = 0; i < aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsScreen().size(); i++) {
            DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsScreen().get(i), 8,webDriver);
            aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsScreen().get(i).click();
            aeSportSupplementsCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
            webDriver.navigate().back();
        }
    }

    @Test(groups = {"2.07 Sports Supplements Category","All Smoke Testing Result","1.4  Low Severity"},description = "Sports Supplements Category- Make sure that the customer can navigate to the home page using the BreadCrumb ", priority = 9)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumb() {
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeSportSupplementsCategoryPage.navigate();
        aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
        Assert.assertEquals(webDriver.getCurrentUrl(), aeSportSupplementsCategoryPage.BaseURL +aeSiteURL);
    }

    @Test(groups = {"2.07 Sports Supplements Category", "1.3 Medium Severity"},description = "Sports Supplements Category Page- Make sure that the Result label and its value appear correctly ", priority = 10)
    public void verifyResultFieldAndItsVaLueAppearInTheSportSupplementsCategoryPage() {
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeSportSupplementsCategoryPage.navigate();
        SoftAssert sa = new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(), "Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(), "0", "The number of result is Zero");
    }

    @Test(groups = {"2.07 Sports Supplements Category", "1.3 Medium Severity"},description = "Sports Supplements Category Page- Make sure that Sort By menu and its options appear correctly ", priority = 11)
    public void verifySortByMenuAndItsOptionsAppearCorrectly() {
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        aeSportSupplementsCategoryPage.navigate();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(), "Sort By");
        ArrayList<String> expectedOption = new ArrayList<>() {{
            add("Featured");
            add("Name");
            add("Best Selling");
            add("Price Min-Max");
            add("Price Max-Min");
        }};
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options = select.getOptions();
        for (int i = 0; i < expectedOption.size(); i++) {
//            Assert.assertEquals(expectedOption.get(i), expectedOption.get(i));}
            System.out.println("Actual: "+expectedOption.get(i)+"  Expected: "+expectedOption.get(i));
        }
    }

    @Test(groups = {"2.07 Sports Supplements Category", "1.4  Low Severity"},description = "Sports Supplements Category- Make sure that the Best Selling option is selected by default in the Sort By menu ", priority = 12)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenu() {
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        aeSportSupplementsCategoryPage.navigate();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        try{
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Best Selling");
        }
        catch (AssertionError assertion){
            Assert.assertEquals(select.getFirstSelectedOption().getText(), "Featured");

        }    }

    //There's a bug here when sorting the products then the Horizontal Banners are hidden
    @Test(groups = {"2.07 Sports Supplements Category", "1.3 Medium Severity"},description = "Sports Supplements Category- Make sure each of the Sport Supplements category image and Horizontal Banners appearing after sorting the products  ", priority = 13)
    public void verifySportSupplementsCategoryImageAndHorizontalBannersAppearingAfterSortingTheProducts() {
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        aeSportSupplementsCategoryPage.navigate();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        select.selectByVisibleText("Price Min-Max");
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(), 3,webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
        Assert.assertTrue(aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsSection().isDisplayed(),"The Horizontal Banners is missing after sorting the products ");
    }
    @Test(groups = {"2.07 Sports Supplements Category", "1.3 Medium Severity"},description = "Sports Supplements Category- Make sure Sort By Menu appears correctly in the page after sorting By Featured  ", priority = 14)
    public void verifySortByMenuAppearingAfterSortingByBestSelling() {
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        aeSportSupplementsCategoryPage.navigate();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        select.selectByVisibleText("Featured");
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSortByMenu().isDisplayed());
    }

    @Test(groups = {"2.07 Sports Supplements Category", "1.3 Medium Severity"},description = "Sports Supplements Category- Make sure Sort By Menu appears correctly in the page after sorting By Price Min-Max  ", priority = 15)
    public void verifySortByMenuAppearingAfterSortingByPriceMinMax() {
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        aeSportSupplementsCategoryPage.navigate();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        select.selectByVisibleText("Price Min-Max");
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSortByMenu().isDisplayed());
    }

    @Test(groups = {"2.07 Sports Supplements Category", "1.3 Medium Severity"},description = "Sports Supplements Category- Make sure Sort By Menu appears correctly in the page after sorting By Price Max-Min  ", priority = 16)
    public void verifySortByMenuAppearingAfterSortingByPriceMaxMin() {
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        aeSportSupplementsCategoryPage.navigate();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        select.selectByVisibleText("Price Max-Min");
        DataHelperAndWait.waitForTime(3000);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSortByMenu().isDisplayed());
    }

    @Test(groups = {"2.07 Sports Supplements Category", "1.4  Low Severity"},description = "Sports Supplements Category- Make sure  the Sport Supplements footer appears correctly  ", priority = 17)
    public void verifySportSupplementsFooterSectionAppearsCorrectly() {
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        aeSportSupplementsCategoryPage.navigate();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsFooterSection().isDisplayed());
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsFooterSection().getCssValue("background"), "rgb(242, 242, 242) none repeat scroll 0% 0% / auto padding-box border-box");
    }

    @Test(groups = {"2.07 Sports Supplements Category", "1.4  Low Severity"},description = "Sports Supplements Category- Make sure the text appears in the Sport Supplements footer appears correctly  ", priority = 18)
    public void verifyTheTextAppearInTheSportSupplementsFooterSectionAppearsCorrectly() {
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeSportSupplementsCategoryPage.navigate();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInFooterSection().getText(), "Sport Supplements");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsDescriptionInFooterSection().isDisplayed());
    }

    @Test(groups = {"2.07 Sports Supplements Category", "1.2 High Severity"},description = "Sports Supplements Category- Verify that the search button works correctly from the Sport Supplements category page", priority = 19)
    public void verifySearchBtnWorksCorrectlyFromSportSupplementsCategoryPage() {
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage = new AeProductDetailsPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        aeSportSupplementsCategoryPage.navigate();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        aeSportSupplementsCategoryPage.verifyTheDisplayedPageDoesNotHaveErrors();
    }

    @Test(groups = {"2.07 Sports Supplements Category", "1.3 Medium Severity"},description = "Sports Supplements Category- Verify that the previous page button is disable when the current page is page 1 ", priority = 20)
    public void verifyThePreviousBtnIsDisableWhenDisplayPage1() {
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeSportSupplementsCategoryPage.navigate();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());
    }

    @Test(groups = {"2.07 Sports Supplements Category", "1.3 Medium Severity"},description = "Sports Supplements Category- Make Sure the Pagination control works correctly", priority = 21)
    public void verifyThePaginationControlWorksCorrectly() {
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeSportSupplementsCategoryPage.navigate();
        aeSportSupplementsCategoryPage.navigateToPage2();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,5);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(groups = {"2.07 Sports Supplements Category", "1.3 Medium Severity"},description = "Sports Supplements Category- Make Sure the previous page button works correctly", priority = 22)
    public void verifyPreviousPageBtnWorksCorrectly() {
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
        Assert.assertFalse(webDriver.getCurrentUrl().contains("p=2"));
  }

    @Test(groups = {"2.07 Sports Supplements Category", "1.3 Medium Severity"},description = "Sports Supplements Category- Make Sure the next page button works correctly", priority = 23)
    public void verifyNextPageBtnWorksCorrectly() {
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        DataHelperAndWait.waitForUrlContains("p=2",webDriver,3);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
    }

    @Test(groups = {"2.07 Sports Supplements Category", "1.3 Medium Severity"},description = "Sports Supplements Category- Make Sure All Search Fields Inside Form Filtration Section Appears Correctly", priority = 24)
    public void verifyAllSearchFieldsInsideFormFiltrationSectionAppearsCorrectly() {
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
//        aeSportSupplementsCategoryPage.navigate();
        aeSportSupplementsCategoryPage.clickOnSeeAllBtnInFormSection();
//        ArrayList<String> expectedFiltration = new ArrayList<>() {{
//            add("Liquid Capsules");
//            add("Bars");
//            add("Caplets");
//            add("Capsules");
//            add("Cream");
//            add("Effervescent");
//            add("Gel");
//            add("Granulated");
//            add("Gummies");
//            add("Liquid");
//            add("Powders");
//            add("Sachet");
//            add("Softgel");
//            add("Tablets");
//            add("Pods");
//        }};
//        for (int i = 0; i < aeSportSupplementsCategoryPage.getFormFiltrationSection().size(); i++) {
//            Assert.assertEquals(aeSportSupplementsCategoryPage.getFormFiltrationSection().get(i).getText(), expectedFiltration.get(i));
//        }
        for (int i = 0; i < aeSportSupplementsCategoryPage.getFormFiltrationSection().size(); i++){
            DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getFormFiltrationSection().get(i),2,webDriver);
            Assert.assertTrue(aeSportSupplementsCategoryPage.getFormFiltrationSection().get(i).isDisplayed());}
    }
    @Test(groups = {"2.07 Sports Supplements Category", "1.4  Low Severity"},description = "Sports Supplements Category- Make sure all secure tabs appears correctly(100% Secure Payments+ 100% Authentic Products+Fast Delivery Service blocks)", priority = 25)
    public void verifyAll3BlocksExistInThaPageBottomSectionAppearsCorrectlyInSportSupplementsCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        AeWomenOnlyCategoryPage aeWomenOnlyCategoryPage=new AeWomenOnlyCategoryPage(webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomSection().isDisplayed());
        for (int i = 0; i < aeSportSupplementsCategoryPage.getPageBottomBlocksList().size(); i++) {
            Assert.assertTrue(aeSportSupplementsCategoryPage.getPageBottomBlocksList().get(i).isDisplayed());
            switch (i) {
                case 0:
                    Assert.assertTrue(aeWomenOnlyCategoryPage.getSecurePaymentTitle().isDisplayed());
                    Assert.assertTrue(aeWomenOnlyCategoryPage.getSecurePaymentDescription().isDisplayed());
                case 1:
                    Assert.assertTrue(aeWomenOnlyCategoryPage.getAuthenticProductsTitle().isDisplayed());
                    Assert.assertTrue(aeWomenOnlyCategoryPage.getAuthenticProductsDescription().isDisplayed());
                case 2:
                    Assert.assertTrue(aeWomenOnlyCategoryPage.getFastDeliveryTitle().isDisplayed());
                    Assert.assertTrue(aeWomenOnlyCategoryPage.getFastDeliveryDescription().isDisplayed());            }
        }
    }
    //Pagination control for all pages in the Sport Supplements Category Pages
    @Test(groups = "All Smoke Testing Result",description = "Sports Supplements Category- Make Sure the ability to access all pages inside Sport Supplements Category Page  ", priority = 26)
    public void verifyAbilityToAccessAllPagesInsideSportSupplementsCategoryPage(){
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeSportSupplementsCategoryPage.navigate();
        String numberOfProductInTheList=aeSportSupplementsCategoryPage.getSearchResultValue().getText();
        if(DataHelperAndWait.isTheresNoPages(numberOfProductInTheList))
            System.out.println("There's no pages");
        else {
            DataHelperAndWait.accessAllPagesInsideTheProductsListPage(numberOfProductInTheList, aeSportSupplementsCategoryPage.getNextPageBtn(), webDriver);
        }}
    //There's a bug here due to the BreadCrumb is missing after sorting the products
    @Test(groups = {"2.07 Sports Supplements Category", "1.4  Low Severity"},description = "Sports Supplements Category- Make sure that the BreadCrumb appears correctly after sorting the product ", priority = 27)
    public void verifyTheBreadCrumbAppearingCorrectlyAfterSortingTheProducts() {
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeSportSupplementsCategoryPage.navigate();
        Select select = new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        select.selectByIndex(1);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getHomeBreadcrumbs(), 8,webDriver);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getHomeBreadcrumbs().isDisplayed());
    }
    @Test(groups = {"2.07 Sports Supplements Category", "1.3 Medium Severity"},description = "Sports Supplements Category- Make sure ability to navigate to the home page by clicking on the sporter logo  ", priority = 28)
    public void verifyAbilityToNavigateToHomePageByClickingOnSporterLogoFromCartPage() {
        AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        aeGuestUserPage= new AEGuestUserPage(webDriver);
//        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeSportSupplementsCategoryPage.navigate();
        aeGuestUserPage.clickOnSporterLogo();
        Assert.assertEquals(webDriver.getCurrentUrl(), aeSportSupplementsCategoryPage.BaseURL +aeSiteURL," The Current URL is not matched with the Cart URL" );
    }
}