/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription EgyptProductDetailsPage
 */

package sporter_pages.productPage;

import core.WebElementsAssertion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class EgyptProductDetailsPage extends ProductDetailsPage {
    public EgyptProductDetailsPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }

    public void displayTheProduct() throws IOException {
        webDriver.navigate().to(BaseURL + egyptDomain + productUrl);
        WebElementsAssertion.validateTheCurrentUrlContainsString(productUrl, webDriver);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }

    public void displayOOSProduct() throws IOException {
        webDriver.navigate().to(BaseURL + egyptDomain + "/organic-nation-guilt-free-chocolate-spread/");
        verifyTheDisplayedPageDoesNotHaveErrors();
    }
}
