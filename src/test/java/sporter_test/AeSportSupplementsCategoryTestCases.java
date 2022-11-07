package sporter_test;

import core.BaseTest;
import core.DataHelperAndWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sporter_pages.AeProductDetailsPage;
import sporter_pages.AeSportSupplementsCategoryPage;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertFalse;

public class AeSportSupplementsCategoryTestCases extends BaseTest {
    private AeSportSupplementsCategoryPage aeSportSupplementsCategoryPage;
    private AEMegaMenuTestCases aeMegaMenuTestCases;
    private AeProductDetailsPage aeProductDetailsPage;


    @Test(description = "Make sure clicking on the Sports Supplements Category Appears In MegaMenu Redirect User To CorrectURL", priority = 1)
    public void verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL() {
        aeMegaMenuTestCases = new AEMegaMenuTestCases();
        aeMegaMenuTestCases.verifyClickingOnSportsSupplementsManiMenuRedirectUserToCorrectURL();
    }

    @Test(description = "Make sure clicking on the Sports Supplements Category from ShopBy Menu Redirect User To CorrectURL", priority = 2)
    public void verifyClickingOnSportsSupplementsCategoryFromShopByMenuRedirectUserToCorrectURL() {
        aeMegaMenuTestCases = new AEMegaMenuTestCases();
        aeMegaMenuTestCases.verifyClickingOnSportsSupplementsOptionInShopByMenuRedirectUserToCorrectURL();
    }
    @Test(description = "Make sure clicking on the Sports Supplements Category from HomePage Redirect User To CorrectURL", priority = 3)
    public void verifyClickingOnSportsSupplementsCategoryFromHomePageRedirectUserToCorrectURL() {
        aeSportSupplementsCategoryPage=new AeSportSupplementsCategoryPage(webDriver);
        aeMegaMenuTestCases = new AEMegaMenuTestCases();
        aeSportSupplementsCategoryPage.switchToAeCountry();
        DataHelperAndWait.waitToBeClickable(aeSportSupplementsCategoryPage.getSportSupplementsCategoryInHomePage(),5);
        aeSportSupplementsCategoryPage.getSportSupplementsCategoryInHomePage().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains(aeMegaMenuTestCases.sportSupplementsUrl));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }

    @Test(description = "Make sure the Horizontal Category Image appears correctly in the sport Supplements landing page ", priority = 4)
    public void verifyTheHorizontalCategoryImageAppearsCorrectlyInSportSupplementsLandingPage(){
        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(),5);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
    }
    @Test(description = "Make sure each of the title and Paragraph appearing in the Horizontal Category Image appears correctly in the sport Supplements landing page ", priority = 5)
    public void verifyTitleAndParagraphAppearingCorrectlyInHorizontalCategoryImageInSportSupplementsLandingPage(){
        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage(),5);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage(),5);
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInCategoryImage().getText(),"Sport Supplements","Wrong title appears in the sport Supplements category image");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getParagraphInSportSupplementsCategoryImage().getText(),"For Every Training Goal & Body Type","Wrong Paragraph appears in the sport Supplements category image");
    }
    @Test(description = "Make sure the Horizontal Banners appear correctly in the sport Supplements landing page ", priority = 6)
    public void verifyTheHorizontalBannersAppearCorrectlyInSportSupplementsLandingPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        DataHelperAndWait.implicitWait(5);
        for (int i = 0; i < aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsScreen().size(); i++) {
            Assert.assertTrue(aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsScreen().get(i).isDisplayed());
        }
    }
    @Test(description = "Make sure clicking on the Horizontal Banners appearing in the sport Supplements landing page opens correctly ", priority = 7)
    public void verifyClickingOnHorizontalBannersAppearingInSportSupplementsLandingPageOpensCorrectly(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        DataHelperAndWait.implicitWait(5);
        for (int i = 0; i < aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsScreen().size(); i++){
            aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsScreen().get(i).click();
            boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
            assertFalse(verifyTitle, "Page Not Found Is Displayed");
            boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
            assertFalse(isTheElementPresent, "The page is empty");
            webDriver.navigate().back();
        }}
        @Test(description = "Make sure that the customer can navigate to the home page using the BreadCrumb appearing in the sport Supplements landing page ", priority = 8)
        public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumb() {
            aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
            this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
            aeSportSupplementsCategoryPage.clickOnBreadcrumbHomePage();
            Assert.assertEquals(webDriver.getCurrentUrl(), aeSiteURL);
        }
    @Test(description = "Make sure that the Result label and its value appear correctly in the sport Supplements Category page ", priority = 9)
    public void verifyResultFieldAndItsVaLueAppearInTheSportSupplementsCategoryPage() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        SoftAssert sa= new SoftAssert();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getResultLabel().getText(),"Results:");
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSearchResultValue().isDisplayed());
        sa.assertNotEquals(aeSportSupplementsCategoryPage.getSearchResultValue().getText(),"0","The number of result is Zero");
    }
    @Test(description = "Make sure that Sort By menu and its options appear correctly ", priority = 10)
    public void verifySortByMenuAndItsOptionsAppearCorrectly() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSortByLabel().getText(),"Sort By");
        ArrayList<String> expectedOption = new ArrayList<String>() {{
            add("Relevance");
            add("Newly added items");
            add("Name");
            add("Best Selling");
            add("Price Min-Max");
            add("Price Max-Min");
        }};
        Select select=new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        List<WebElement> options= select.getOptions();
        for(int i=0;i<options.size();i++){
            Assert.assertEquals(options.get(i).getText(), expectedOption.get(i));
    }
     }
    @Test(description = "Make sure that the Best Selling option is selected by default in the Sort By menu ", priority = 11)
    public void verifyBestSellingOptionIsSelectedByDefaultInSortByMenu(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Select select=new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        Assert.assertEquals(select.getFirstSelectedOption().getText(),"Best Selling");
    }
    //There's a bug here when sorting the products then the Horizontal Banners are hidden
    @Test(description = "Make sure each of the Sport Supplements category image and Horizontal Banners appearing after sorting the products  ", priority = 12)
    public void verifySportSupplementsCategoryImageAndHorizontalBannersAppearingAfterSortingTheProducts() throws InterruptedException {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Select select=new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        select.selectByVisibleText("Name");
        Thread.sleep(3000);
        DataHelperAndWait.waitToBeVisible(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage(),5);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsCategoryImage().isDisplayed());
        DataHelperAndWait.implicitWait(6);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getMainBannersInTheSportSupplementsSection().isDisplayed());
}
//There's a bug here
    @Test(description = "Make sure Sort By Menu appears correctly in the page after sorting By Newly added items  ", priority = 13)
    public void verifySortByMenuAppearingAfterSortingByNewlyAddedItems() throws InterruptedException {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Select select=new Select(aeSportSupplementsCategoryPage.getSortByMenu());
            select.selectByVisibleText("Newly added items");
            Thread.sleep(3000);
            Assert.assertTrue(aeSportSupplementsCategoryPage.getSortByMenu().isDisplayed());
    }
    @Test(description = "Make sure Sort By Menu appears correctly in the page after sorting By Relevance  ", priority = 14)
    public void verifySortByMenuAppearingAfterSortingByRelevance() throws InterruptedException {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Select select=new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        select.selectByVisibleText("Relevance");
        Thread.sleep(3000);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSortByMenu().isDisplayed());
    }
    @Test(description = "Make sure Sort By Menu appears correctly in the page after sorting By Name  ", priority = 15)
    public void verifySortByMenuAppearingAfterSortingByName() throws InterruptedException {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Select select=new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        select.selectByVisibleText("Name");
        Thread.sleep(3000);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSortByMenu().isDisplayed());
    }
    @Test(description = "Make sure Sort By Menu appears correctly in the page after sorting By Best Selling  ", priority = 16)
    public void verifySortByMenuAppearingAfterSortingByBestSelling() throws InterruptedException {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Select select=new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        select.selectByVisibleText("Best Selling");
        Thread.sleep(3000);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSortByMenu().isDisplayed());
    }
    @Test(description = "Make sure Sort By Menu appears correctly in the page after sorting By Price Min-Max  ", priority = 17)
    public void verifySortByMenuAppearingAfterSortingByPriceMinMax() throws InterruptedException {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Select select=new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        select.selectByVisibleText("Price Min-Max");
        Thread.sleep(3000);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSortByMenu().isDisplayed());
    }
    @Test(description = "Make sure Sort By Menu appears correctly in the page after sorting By Price Max-Min  ", priority = 18)
    public void verifySortByMenuAppearingAfterSortingByPriceMaxMin() throws InterruptedException {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Select select=new Select(aeSportSupplementsCategoryPage.getSortByMenu());
        select.selectByVisibleText("Price Max-Min");
        Thread.sleep(3000);
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSortByMenu().isDisplayed());
    }
    @Test(description = "Make sure  the Sport Supplements footer appears correctly  ", priority = 19)
    public void verifySportSupplementsFooterSectionAppearsCorrectly() {
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertTrue(aeSportSupplementsCategoryPage.getSportSupplementsFooterSection().isDisplayed());
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsFooterSection().getCssValue("background"), "rgb(242, 242, 242) none repeat scroll 0% 0% / auto padding-box border-box");
    }
    @Test(description = "Make sure the text appears in the Sport Supplements footer appears correctly  ", priority = 20)
    public void verifyTheTextAppearInTheSportSupplementsFooterSectionAppearsCorrectly(){
        aeSportSupplementsCategoryPage = new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsTitleInFooterSection().getText(),"Sport Supplements");
        Assert.assertEquals(aeSportSupplementsCategoryPage.getSportSupplementsDescriptionInFooterSection().getText(),"You work hard to reach your athletic goals. You stick to your training program and to your nutrition plan. Now you want an edge over your performance. Is there a supplement that could give it to you?\n" +
                "\n" + "The answer is yes, sports supplements are effective for a wide range of people; athletes, bodybuilders, beginners and who ever want to live a healthier lifestyle. The benefits of using sports supplements do not stop at pushing the boundaries of elite performance; they can be used to start any health and fitness plan into action. Sport supplements can adjust your physical appearance for the better. They can also have a positive effect in other parts of your life too, such as your overall health and wellbeing.\n" +
                "\n" + "In order to make your workout count, there are two key ingredients: mental motivation and physical drive. You bring the focus and we provide the fuel your body needs to perform at its best. Our wide range of sport supplements including powders, tablets and drinks, have all been formulated to nourish your body with the essential ingredients to achieve your true strength.\n" +
                "Sporter puts between your hands the best sport supplements from the best brands around the world. Shop your favorite at best price and reach your fitness goals faster than ever before.");
    }
    @Test(description = "Verify that the search button works correctly from the Sport Supplements category page", priority = 21)
    public void verifySearchBtnWorksCorrectlyFromSportSupplementsCategoryPage(){
        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        aeProductDetailsPage= new AeProductDetailsPage(webDriver);
        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeProductDetailsPage.searchForBundle();
        aeProductDetailsPage.getSearchBtn().click();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search"));
        boolean verifyTitle = webDriver.getTitle().equalsIgnoreCase("Sporter.com - Page Not Found");
        assertFalse(verifyTitle, "Page Not Found Is Displayed");
        boolean isTheElementPresent = webDriver.getPageSource().contains("We can't find products matching the selection.");
        assertFalse(isTheElementPresent, "The page is empty");
    }
    @Test(description = "Verify that the previous page button is disable when the current page is page 1 ", priority = 22)
    public void verifyThePreviousBtnIsDisableWhenDisplayPage1(){
        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
    Assert.assertTrue(aeSportSupplementsCategoryPage.getDisabledPreviousPageBtn().isDisplayed());
    }
    @Test(description = "Make Sure the Pagination control works correctly", priority = 23)
    public void verifyThePagenationControlWorksCorrectly() throws InterruptedException {
        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeSportSupplementsCategoryPage.navigateToPage2();
        Thread.sleep(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
        aeSportSupplementsCategoryPage.navigateToPage3();
        Thread.sleep(3000);
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
   @Test(description = "Make Sure the previous page button works correctly", priority = 24)
   public void verifyPreviousPageBtnWorksCorrectly() throws InterruptedException {
       aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
       this.verifyThePagenationControlWorksCorrectly();
       aeSportSupplementsCategoryPage.clickOnPreviousPageBtn();
       Assert.assertTrue(webDriver.getCurrentUrl().contains("p=2"));
   }
    @Test(description = "Make Sure the next page button works correctly", priority = 25)
    public void verifyNextPageBtnWorksCorrectly() throws InterruptedException {
        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        this.verifyThePagenationControlWorksCorrectly();
        aeSportSupplementsCategoryPage.clickOnNextPageBtn();
        Assert.assertTrue(webDriver.getCurrentUrl().contains("p=3"));
    }
    @Test(description = "Make Sure All Search Fields Inside Form Filtration Section Appears Correctly", priority = 26)
    public void verifyAllSearchFieldsInsideFormFiltrationSectionAppearsCorrectly(){
        aeSportSupplementsCategoryPage= new AeSportSupplementsCategoryPage(webDriver);
        this.verifyClickingOnSportsSupplementsCategoryAppearsInMegaMenuRedirectUserToCorrectURL();
        aeSportSupplementsCategoryPage.clickOnSeeAllBtnInFormSection();
        ArrayList<String> expectedFiltration = new ArrayList<String>() {{
            add("Liquid Capsules");
            add("Bars");
            add("Caplets");
            add("Capsules");
            add("Cream");
            add("Effervescent");
            add("Gel");
            add("Granulated");
            add("Gummies");
            add("Liquid");
            add("Powders");
            add("Sachet");
            add("Softgel");
            add("Tablets");
            add("Pods");
        }};
        for(int i = 0; i<aeSportSupplementsCategoryPage.getFormFiltrationSection().size(); i++){
            Assert.assertEquals(aeSportSupplementsCategoryPage.getFormFiltrationSection().get(i).getText(), expectedFiltration.get(i));
        }
    }
















}