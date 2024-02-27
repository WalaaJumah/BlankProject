/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription AccountRegistrationPage
 */

package eureka_pages.AccountRegistrationPage;
import core.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

@Getter
public class AccountRegistrationPage extends BasePage {
    public AccountRegistrationPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
    public void navigateToRegistrationPage() throws IOException {
        webDriver.manage().deleteAllCookies();
        webDriver.navigate().to(BaseURL + registerAccountLink);
        verifyTheDisplayedPageDoesNotHaveErrors();
//        DataHelperAndWait.waitToBeInVisible(this.getLastNameField(),webDriver);
    }
}