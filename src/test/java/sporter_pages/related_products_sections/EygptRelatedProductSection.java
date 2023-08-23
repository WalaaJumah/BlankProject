/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription EygptRelatedProductSection
 */

package sporter_pages.related_products_sections;

import core.WebElementsAssertion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class EygptRelatedProductSection extends RelatedProductSection {
    public EygptRelatedProductSection(WebDriver webDriver) {
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
