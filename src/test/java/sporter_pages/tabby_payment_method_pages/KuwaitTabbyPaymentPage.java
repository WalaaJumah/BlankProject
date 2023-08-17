/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.tabby_payment_method_pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class KuwaitTabbyPaymentPage extends TabbyPaymentPage {
//    @FindBy(xpath = "(//li[@class='countryItem_container__StFb3']/a)[6]")
    @FindBy(xpath = "//li[@id='CountryItem_KW']/a")
    private WebElement kuwaitCountry;


    public KuwaitTabbyPaymentPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}