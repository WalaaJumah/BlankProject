/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.tamara_payment_method_pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class BahrainTamaraPaymentPage extends TamaraPaymentPage {
//    @FindBy(xpath = "(//li[@class='countryItem_container__StFb3']/a)[4]")
    @FindBy(xpath = "//li[@id='CountryItem_BH']/a")
    private WebElement bahrainCountry;


    public BahrainTamaraPaymentPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
