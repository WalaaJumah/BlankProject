/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription UAERelatedProductSection
 */

package sporter_pages.related_products_sections;

import core.WebElementsAssertion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class UAERelatedProductSection extends RelatedProductSection {
    public UAERelatedProductSection(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }

    public void displayTheProduct() throws IOException {
        webDriver.navigate().to(BaseURL + aeDomain + productUrl);
        WebElementsAssertion.validateTheCurrentUrlContainsString(productUrl, webDriver);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }
}
