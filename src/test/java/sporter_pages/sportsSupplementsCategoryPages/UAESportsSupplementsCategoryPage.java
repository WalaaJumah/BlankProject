/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription SportsSupplementsCategoryPage
 */

package sporter_pages.sportsSupplementsCategoryPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UAESportsSupplementsCategoryPage extends SportsSupplementsCategoryPage {
    public UAESportsSupplementsCategoryPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
