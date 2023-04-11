/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription EgyptProductDetailsTestCases]
 */

package sporter_test.productTestCases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.homepage_classes.EgyptHomePage;
import sporter_pages.megaMenuPages.MegaMenuPage;
import sporter_pages.productPage.EgyptProductDetailsPage;
import sporter_pages.productPage.ProductDetailsPage;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

//@Test(groups = "Egypt Product Details Page")
public class EgyptProductDetailsTestCases extends ProductDetailsTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToEgyptStore() {
        EgyptHomePage egyptHomePage = new EgyptHomePage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        egyptHomePage.switchCountry(egyptHomePage.getEgyptCountry());
        if (webDriver.getCurrentUrl().contains(egyptHomePage.egyptDomain)) {
            System.out.println("You are in Jordan Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + egyptHomePage.egyptDomain);
            CloseInitialDialog();
//            productDetailsPage.storeCountry="/en-eg";
            productDetailsPage.storeCountry = "/en-eg";
        }
    }
@Test(enabled = false)
public void verifyAbilityToClickOnSportsMenuIsDisplayedFromProductDetailsPage() throws IOException {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        MegaMenuPage megaMenuPage = new MegaMenuPage(webDriver);
        productDetailsPage.displayTheProduct();
        try{
            megaMenuPage.clickOnSportsMainMenu();}
        catch (Exception e){
            DataHelperAndWait.clickOnElement(megaMenuPage.getSportsMenu(),webDriver);
        }

        megaMenuPage.verifyTheDisplayedPageDoesNotHaveErrors();
        try {
            WebElementsAssertion.validateTheCurrentUrlContainsString(megaMenuPage.sportsUrl, webDriver);
        } catch (Exception e) {
            WebElementsAssertion.validateTheCurrentUrlContainsString(megaMenuPage.sportsUrl + "/", webDriver);
        }
    }

    @Test(groups = { "1.3 Medium Severity"},description = "{{CountryName}}: Make sure the out of stock message appears when displaying out of stock product ", priority =4)
    public void verifyOOSMessageIsDisplayed() {
        try{
        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
        egyptProductDetailsPage.displayOOSProduct();
        WebElementsAssertion.validateTheElementIsDisplayed(egyptProductDetailsPage.getOOSMsg(),webDriver);}
        catch (AssertionError r){
            System.out.println("The Product is not available in this store");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Test(groups = {"All Smoke Testing Result", "1.2 High Severity"},description = "{{CountryName}}: Make sure ability to display the bundle and select all options", priority = 15)
    public void verifyAbilityToDisplayBundleAndSelectAllOptions() throws IOException {
        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
        egyptProductDetailsPage.displayBundle();
        DataHelperAndWait.waitToBeVisible(egyptProductDetailsPage.getBundleMenu(), webDriver);
        Select select = new Select(egyptProductDetailsPage.getBundleMenu());
        WebElement currentSelectedOption = select.getFirstSelectedOption();
        String currentSelectedOptionText = currentSelectedOption.getText();
        System.out.println(currentSelectedOptionText);
        DataHelperAndWait.selectAllDropDownListOptions(select);
        WebElement newSelectedOption = select.getAllSelectedOptions().get(0);
        String newSelectedOptionText = newSelectedOption.getText();
        System.out.println(newSelectedOptionText);
        Assert.assertNotEquals(currentSelectedOptionText, newSelectedOptionText);
    }
    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Verify that the Supplement Facts section displays correctly in the PDP", priority = 18, enabled = false)
    public void verifySupplementFactsSectionDisplaysCorrectlyInProductDetailsPage() throws IOException {
        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
        egyptProductDetailsPage.displayTheProduct();
        assertTrue(egyptProductDetailsPage.getSupplementFactsTable().isDisplayed());
        assertEquals(egyptProductDetailsPage.getSupplementFactsTitle().getText(), "Supplement Facts");
    }
    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Verify that the Direction Of Use section displays correctly in the PDP", priority = 25, enabled = false)
    public void verifyDirectionOfUseSectionDisplaysCorrectlyInProductDetailsPage() throws IOException {
        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
        egyptProductDetailsPage.displayTheProduct();
//        assertTrue(egyptProductDetailsPage.getDirectionsOfUseSection().isDisplayed());
    }

    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Verify that the About Brand section displays correctly in the PDP", priority = 26, enabled = false)
    public void verifyAboutBrandSectionDisplaysCorrectlyInProductDetailsPage() {
        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
        assertTrue(egyptProductDetailsPage.getAboutBrandSection().isDisplayed());
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}: Make sure that the simple price changes when navigation between sizes for the config ", priority = 35, enabled = false)
    public void verifySimplePriceChangesWhenNavigationBetweenSizesForTheConfig() throws IOException {
        EgyptProductDetailsPage egyptProductDetailsPage = new EgyptProductDetailsPage(webDriver);
        egyptProductDetailsPage.displayTheProduct();
//        DataHelperAndWait.clickOnElement(egyptProductDetailsPage.getFirstsimple(),webDriver);
        String firstPrice = egyptProductDetailsPage.getFinalProductPrice().getText();
//        DataHelperAndWait.clickOnElement(egyptProductDetailsPage.getSecondsimple(),webDriver);
        String secondPrice = egyptProductDetailsPage.getFinalProductPrice().getText();
        Assert.assertNotEquals(firstPrice, secondPrice, "The simple price is not changes");
    }
}