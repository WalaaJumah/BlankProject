/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription JordanRelatedProductsTestCases
 */

package sporter_test.related_product_test_cases;

import core.BasePage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.homepage_classes.JordanHomePage;
import sporter_pages.productPage.JordanProductDetailsPage;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

//@Test(groups = "Jordan Product Details Page")

public class JordanRelatedProductsTestCases extends RelatedProductsTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToJordanStore() {
        JordanHomePage jordanHomePage = new JordanHomePage(webDriver);
        jordanHomePage.switchCountry(jordanHomePage.getJordanCountry());
        if (webDriver.getCurrentUrl().contains(jordanHomePage.jordanDomain)) {
            System.out.println("You are in Jordan Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + jordanHomePage.jordanDomain);
            //CloseInitialDialog();
            System.out.println(webDriver.getCurrentUrl());
        }
    }
}