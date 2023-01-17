/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription EgyptHomePage
 */

package sporter_pages.homepage_classes;

import core.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
@Getter
public class EgyptHomePage extends BasePage {
    public EgyptHomePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
    @FindBy(xpath ="//ul[@class='dropdown switcher-dropdown']/li[4]" )
    private WebElement egyptCountry;
}
