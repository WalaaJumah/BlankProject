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
import org.openqa.selenium.support.ui.Select;

@Getter
public class QatarTabbyPaymentPage extends TabbyPaymentPage {
    public QatarTabbyPaymentPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    @FindBy(id="areaSelector")
    private WebElement areaField;
    public void selectFirstOptionInAreaMenu(){
        Select areaField = new Select(getAreaField());
        areaField.selectByIndex(1);


    }
}
