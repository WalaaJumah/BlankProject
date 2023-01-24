/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription UAEProductDetailsPage
 */

package sporter_pages.productPage;

import core.WebElementsAssertion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UAEProductDetailsPage extends ProductDetailsPage {
    public UAEProductDetailsPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
    public void displayTheProduct() {
        webDriver.navigate().to(BaseURL + aeDomain + productUrl);
        WebElementsAssertion.validateTheCurrentUrlContainsString(productUrl,webDriver);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }
}
