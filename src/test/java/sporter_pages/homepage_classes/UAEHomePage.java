/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription UAEHomePageTestCases
 */

package sporter_pages.homepage_classes;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
@Getter
public class UAEHomePage extends HomePage {
    public UAEHomePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
    @FindBy(xpath ="//ul[@class='dropdown switcher-dropdown']/li[1]" )
    private WebElement AeCountry;
}
