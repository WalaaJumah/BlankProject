/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription EgyptHomePage
 */

package sporter_pages.homepage_classes;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class EgyptHomePage extends HomePage {
//    @FindBy(xpath = "((//li[@class='countryItem_container__StFb3']/a)[2]")
    @FindBy(xpath = "//li[@id='CountryItem_EG']/a")
    private WebElement egyptCountry;

    public EgyptHomePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
}
