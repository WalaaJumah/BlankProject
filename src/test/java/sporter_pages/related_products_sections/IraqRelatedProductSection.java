/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_pages.related_products_sections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class IraqRelatedProductSection extends RelatedProductSection {
    public IraqRelatedProductSection(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
}
