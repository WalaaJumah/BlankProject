/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription JordanRelatedProductSection
 */

package sporter_pages.related_products_sections;

import core.WebElementsAssertion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class JordanRelatedProductSection extends RelatedProductSection {
    public JordanRelatedProductSection(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

}