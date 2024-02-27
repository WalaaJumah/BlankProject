/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription LoginPage
 */

package eureka_pages.loginPage;

import core.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
@Getter
public class LoginPage extends BasePage {
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    public void navigateToLoginPage() throws IOException {
//        webDriver.manage().deleteCookieNamed("uid");
        webDriver.navigate().to(BaseURL + loginLink);
        verifyTheDisplayedPageDoesNotHaveErrors();
        if (!webDriver.getCurrentUrl().contains(loginLink))
            webDriver.navigate().to(BaseURL + loginLink);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }
}