/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription QatarRelatedProductSection
 */

package sporter_pages.related_products_sections;

import core.WebElementsAssertion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class QatarRelatedProductSection extends RelatedProductSection {
    public QatarRelatedProductSection(WebDriver webDriver) {
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
