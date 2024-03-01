/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package eureka_pages.profilePages;

import core.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
@Getter
public class ProfilePage extends BasePage {
    public ProfilePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    public void navigateToMyAccountPage() {
        webDriver.navigate().to(BaseURL + profileLink);
        DataHelperAndWait.waitForUrlContains(profileLink, webDriver);
    }
}
