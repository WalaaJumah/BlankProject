/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.guestCheckoutCyclePages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
@Getter
public class KSAGuestCheckoutCyclePage extends  GuestCheckoutCyclePage{
    public KSAGuestCheckoutCyclePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    @FindBy(xpath = "//div[contains(@id,'pickupinstore')]")
    private WebElement pickupInStoreMethod;
     @FindBy(xpath = "//div[contains(@id,'ksadoortodoor')]")
    private WebElement doorToDoorMethod;
    @Test(enabled = false)
    public void verifyTheGuestUserCannotSubmitTheShippingInformationUsingInvalidNationalID(){}
}
