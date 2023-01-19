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
public class EgyptHomePage extends HomePage {
    public EgyptHomePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
    @FindBy(xpath ="(//li[@class='countryItem_container__StFb3']/a)[2]" )
    private WebElement egyptCountry;
}
