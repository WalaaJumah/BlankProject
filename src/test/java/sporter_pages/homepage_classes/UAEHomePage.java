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
//    @FindBy(xpath = "(//li[@class='countryItem_container__StFb3']/a)[1]")
@FindBy(xpath = "//li[@id='CountryItem_AE']/a")
private WebElement AeCountry;

    public UAEHomePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }
}
