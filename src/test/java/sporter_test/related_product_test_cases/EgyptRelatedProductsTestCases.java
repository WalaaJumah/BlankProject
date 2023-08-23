/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription EgyptRelatedProductsTestCases]
 */

package sporter_test.related_product_test_cases;

import core.BasePage;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.homepage_classes.EgyptHomePage;
import sporter_pages.megaMenuPages.EgyptMegaMenuPage;
import sporter_pages.megaMenuPages.MegaMenuPage;
import sporter_pages.productPage.EgyptProductDetailsPage;
import sporter_pages.productPage.ProductDetailsPage;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

//@Test(groups = "Egypt Product Details Page")
public class EgyptRelatedProductsTestCases extends RelatedProductsTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToEgyptStore() {
        EgyptHomePage egyptHomePage = new EgyptHomePage(webDriver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(webDriver);
        egyptHomePage.switchCountry(egyptHomePage.getEgyptCountry());
        if (webDriver.getCurrentUrl().contains(egyptHomePage.egyptDomain)) {
            System.out.println("You are in Jordan Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + egyptHomePage.egyptDomain);
            //CloseInitialDialog();
//            productDetailsPage.storeCountry="/en-eg";
            productDetailsPage.storeCountry = "/en-eg";
        }
    }
}