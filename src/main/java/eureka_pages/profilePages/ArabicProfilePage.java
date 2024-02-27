/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package eureka_pages.profilePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ArabicProfilePage extends ProfilePage {
    public ArabicProfilePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
