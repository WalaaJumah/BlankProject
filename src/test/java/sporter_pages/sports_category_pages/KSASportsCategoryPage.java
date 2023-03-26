/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.sports_category_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class KSASportsCategoryPage extends SportsCategoryPage{
    public KSASportsCategoryPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
