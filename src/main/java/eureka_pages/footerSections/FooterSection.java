/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package eureka_pages.footerSections;

import core.BasePage;
import core.DataHelperAndWait;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

@Getter
public class FooterSection extends BasePage {
    public FooterSection(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    public void accessAllLinksInTheList(List<WebElement> elements) throws IOException {
        for (int i = 0; i < elements.size(); i++) {
            DataHelperAndWait.waitToBeVisible(elements.get(i), webDriver);
//            DataHelperAndWait.clickOnElement(elements.get(i), webDriver);
            DataHelperAndWait.navigateToUrl(elements.get(i).getAttribute("href"),webDriver);
            verifyTheDisplayedPageDoesNotHaveErrors();
        }
    }

}
