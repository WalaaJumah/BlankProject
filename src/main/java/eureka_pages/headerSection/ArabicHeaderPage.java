/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription Egypt Header Page
 */

package eureka_pages.headerSection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ArabicHeaderPage extends HeaderSection {
    public ArabicHeaderPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
