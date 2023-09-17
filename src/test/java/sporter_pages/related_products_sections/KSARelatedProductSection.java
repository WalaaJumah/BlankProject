/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription KSARelatedProductSection
 */

package sporter_pages.related_products_sections;

import core.WebElementsAssertion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class KSARelatedProductSection extends RelatedProductSection {
    public KSARelatedProductSection(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }

}