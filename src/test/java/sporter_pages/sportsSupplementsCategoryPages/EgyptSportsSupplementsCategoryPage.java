/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.sportsSupplementsCategoryPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EgyptSportsSupplementsCategoryPage extends SportsSupplementsCategoryPage {
    public EgyptSportsSupplementsCategoryPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}