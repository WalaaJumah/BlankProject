/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription UAEHomePage
 */

package sporter_pages.homepage_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UAEHomePage extends HomePage {
    public UAEHomePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
}
