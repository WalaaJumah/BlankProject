/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription JordanProductDetailsTestCases
 */

package sporter_test.productTestCases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.JordanHomePage;
import sporter_pages.productPage.ProductDetailsPage;

@Test(groups = "Jordan Product Details Page")

public class JordanProductDetailsTestCases  extends ProductDetailsTestCases{
    @BeforeClass
    public void switchToJordanStore(){
        JordanHomePage jordanHomePage=new JordanHomePage(webDriver);
        jordanHomePage.switchCountry(jordanHomePage.getJordanCountry());
        if(webDriver.getCurrentUrl().contains(jordanHomePage.jordanDomain)){
            System.out.println("You are in Jordan Store");
        }
        else {
            webDriver.navigate().to(BasePage.BaseURL+jordanHomePage.jordanDomain);
            CloseInitialDialog();
            System.out.println(webDriver.getCurrentUrl());
        }
    }
    @Test(groups = {"Product Page", "1.3 Medium Severity"},description = "Make sure that the customer can navigate to the home page using the BreadCrumb ", priority = 12)
    public void verifyAbilityToNavigateToHomePageUsingTheBreadCrumb() {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        DataHelperAndWait.clickOnElement(productDetailsPage.getHomeBreadcrumbs(),webDriver);
        WebElementsAssertion.assertTheUrlEqualExpectedUrl(webDriver.getCurrentUrl(),BasePage.BaseURL +productDetailsPage.jordanDomain,webDriver);
    }
    @Test(groups = {"Product Page", "1.3 Medium Severity"},description = "Make sure ability to navigate to the home page by clicking on the sporter logo from the product Details Page  ", priority = 36)
    public void verifyAbilityToNavigateToHomePageByClickingOnSporterLogoFromPdp() {
        HeaderSection headerSection=new HeaderSection(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.displayTheProduct();
        DataHelperAndWait.clickOnElement(headerSection.getSporterLogo(),webDriver);
        WebElementsAssertion.assertTheUrlEqualExpectedUrl(webDriver.getCurrentUrl(), BasePage.BaseURL +productDetailsPage.jordanDomain+"/",webDriver);
    }
}