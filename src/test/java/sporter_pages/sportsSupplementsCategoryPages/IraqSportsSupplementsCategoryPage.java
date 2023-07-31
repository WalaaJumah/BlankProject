/**
 * @author w.jumaa
 * @projectName QATesting
 * @classDescription
 */

package sporter_pages.sportsSupplementsCategoryPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class IraqSportsSupplementsCategoryPage extends SportsSupplementsCategoryPage{
    public IraqSportsSupplementsCategoryPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
