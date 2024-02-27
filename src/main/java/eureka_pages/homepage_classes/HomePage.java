/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription This class contains all elements related to the Home Page
 */

package eureka_pages.homepage_classes;

import core.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

@Getter
public class HomePage extends BasePage {
    public HomePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}