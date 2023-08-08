/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.tamara_payment_method_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UAETamaraPaymentPage extends TamaraPaymentPage {
    public UAETamaraPaymentPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
