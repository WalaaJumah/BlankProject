/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription HeaderSection
 */

package eureka_pages.headerSection;

import core.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
@Getter
public class HeaderSection extends BasePage {
    public HeaderSection(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
}