/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription UAEHomePageTestCases
 */

package site_pages.homepage;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

@Getter
public class ArabicHomePage extends HomePage {
    public ArabicHomePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

}