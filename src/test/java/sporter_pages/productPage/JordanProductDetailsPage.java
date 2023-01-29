/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription JordanProductDetailsPage
 */

package sporter_pages.productPage;

import core.WebElementsAssertion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class JordanProductDetailsPage extends ProductDetailsPage {
    public JordanProductDetailsPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
    public void displayTheProduct() {
        webDriver.navigate().to(BaseURL + jordanDomain + productUrl);
        WebElementsAssertion.validateTheCurrentUrlContainsString(productUrl,webDriver);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }
    public void displayOOSProduct() {
        webDriver.navigate().to(BaseURL + jordanDomain + oOSProductUrl);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }
}
