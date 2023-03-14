/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription QatarProductDetailsPage
 */

package sporter_pages.productPage;

import core.WebElementsAssertion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class QatarProductDetailsPage extends ProductDetailsPage {
    public QatarProductDetailsPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
    public void displayTheProduct() throws IOException {
        webDriver.navigate().to(BaseURL + qatarDomain + productUrl);
        verifyTheDisplayedPageDoesNotHaveErrors();
        WebElementsAssertion.validateTheCurrentUrlContainsString(productUrl, webDriver);
    }
    public void displayOOSProduct() throws IOException {
        webDriver.navigate().to(BaseURL + qatarDomain + oOSProductUrl);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }
}
