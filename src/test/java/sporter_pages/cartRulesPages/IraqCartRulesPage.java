/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_pages.cartRulesPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class IraqCartRulesPage extends CartRulesPage{
    public IraqCartRulesPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
