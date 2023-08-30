/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription CartTestCases
 */

package sporter_test.cartTestCases;

import core.BasePage;
import core.DataHelperAndWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sporter_pages.cartPages.CartPage;
import sporter_pages.homepage_classes.UAEHomePage;
import sporter_pages.productPage.ProductDetailsPage;

import java.io.IOException;

public class UAECartTestCases extends CartTestCases {
    @BeforeClass(alwaysRun = true)
    public void switchToUAEStore() {
        UAEHomePage uaeHomePage = new UAEHomePage(webDriver);
        uaeHomePage.switchCountry(uaeHomePage.getAeCountry());
        if (webDriver.getCurrentUrl().contains(uaeHomePage.aeDomain)) {
            System.out.println("You are in UAE Store");
        } else {
            webDriver.navigate().to(BasePage.BaseURL + uaeHomePage.aeDomain);
            //CloseInitialDialog();
            System.out.println(webDriver.getCurrentUrl());
        }
    }
    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}: Verify that the The requested qty is not available message appear when the product becomes OOS", priority = 18)
    public void verifyToDisplayRequestedQtyIsNotAvailableMsg() throws IOException {
        CartPage cartPage = new CartPage(webDriver);
        ProductDetailsPage productDetailsPage= new ProductDetailsPage(webDriver);
        if(cartPage.IsEmptyCart()) {
            webDriver.navigate().to("https://qa1.sporter.com/en-ae/grenade-carb-killa-protein-bar-18617/");
            productDetailsPage.addToCart();
            productDetailsPage.viewCart();
        }
        DataHelperAndWait.hoverOnElementAndClick(cartPage.getFirstQtyField(), webDriver);
        DataHelperAndWait.updateAllText(cartPage.getFirstQtyField(),"999");
        //TODO: Needs to recheck after solving Cart loading issue
        cartPage.proceedToCheckout();
        cartPage.waitTillCartSpinnerDisappear(webDriver);
        DataHelperAndWait.waitToBeVisible(cartPage.getCloseAddToCartErrorMsg(), webDriver);
    }
}
