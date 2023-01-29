/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription KSAProductDetailsPage
 */

package sporter_pages.productPage;

import core.WebElementsAssertion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class KSAProductDetailsPage extends ProductDetailsPage {
    public KSAProductDetailsPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
    public void displayTheProduct() {
        webDriver.navigate().to(BaseURL + saudiDomainArabic + productUrl);
        WebElementsAssertion.validateTheCurrentUrlContainsString(productUrl,webDriver);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }
    public void displayOOSProduct() {
        webDriver.navigate().to(BaseURL + saudiDomainArabic + oOSProductUrl);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }
}
