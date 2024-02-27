/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription ForgetPasswordPage
 */

package eureka_pages.forgetPasswordPage;

import core.BasePage;
import eureka_pages.headerSection.HeaderSection;
import eureka_pages.homepage_classes.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ForgetPasswordPage extends BasePage {
    HomePage homePage = new HomePage(webDriver);
    HeaderSection headerSection = new HeaderSection(webDriver);

    public ForgetPasswordPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
