/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription JordanHeaderPage
 */

package sporter_pages.headerPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import sporter_pages.homepage_classes.HomePage;

public class JordanHeaderPage extends HeaderPage {
    public JordanHeaderPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
