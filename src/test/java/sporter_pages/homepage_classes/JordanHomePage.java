/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription Jordan HomePage
 */

package sporter_pages.homepage_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class JordanHomePage extends HomePage {
    public JordanHomePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
}
