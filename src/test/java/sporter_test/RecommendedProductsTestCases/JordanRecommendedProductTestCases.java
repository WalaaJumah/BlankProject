/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription JordanRecommendedProductTestCases
 */

package sporter_test.RecommendedProductsTestCases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.RecommendedProductsPage.JordanRecommendedProductPage;
import sporter_pages.RecommendedProductsPage.RecommendedProductPage;
import sporter_pages.homepage_classes.JordanHomePage;
import sporter_pages.productPage.JordanProductDetailsPage;
import sporter_pages.productPage.ProductDetailsPage;

//@Test(groups = "Jordan Product Details Page")
public class JordanRecommendedProductTestCases extends RecommendedProductTestCases {
    @BeforeClass(alwaysRun=true)
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
@Test(enabled = false)
public void verifyViewCartWorksBtnCorrectly() {}
    @Test(enabled = false)
    public void verifyRecommendedProductsPopUpisHiddenAfterClickingOnTheKeepShoppingBtn() {}
    @Test(enabled = false)
    public void verifyRecommendedProductsPopUpisHiddenAfterClickingOnTheViewBtn() {}
}