/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.myAccountPages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class BahrainMyAccountPage extends MyAccountPage {
//    @FindBy(xpath = "(//li[@class='countryItem_container__StFb3']/a)[4]")
    @FindBy(xpath = "//li[@id='CountryItem_BH']/a")
    private WebElement bahrainCountry;


    public BahrainMyAccountPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}