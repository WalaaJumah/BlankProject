/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.myAccountPages;

import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import sporter_pages.guestCheckoutCyclePages.GuestCheckoutCyclePage;

public class JordanMyAccountPage extends MyAccountPage {
    public JordanMyAccountPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public void fillInNewAddressForm(String firstName, String lastName, String phone, String addressName, String streetLineOne, String streetLineTwo, String nationalId) {
        GuestCheckoutCyclePage guestCheckoutCyclePage= new GuestCheckoutCyclePage(webDriver);
        DataHelperAndWait.waitToBeVisible(this.getFirstNameFieldInAddress(), webDriver);
        DataHelperAndWait.updateAllText(this.getFirstNameFieldInAddress(), firstName);
        DataHelperAndWait.waitToBeVisible(this.getLastNameFieldInAddress(), webDriver);
        DataHelperAndWait.updateAllText(this.getLastNameFieldInAddress(), lastName);
        DataHelperAndWait.waitToBeVisible(this.getPhoneFieldInAddress(), webDriver);
        DataHelperAndWait.updateAllText(this.getPhoneFieldInAddress(), phone);
        DataHelperAndWait.waitToBeVisible(this.getAddressNameField(), webDriver);
        DataHelperAndWait.updateAllText(this.getAddressNameField(), addressName);
        DataHelperAndWait.waitToBeVisible(this.getStreet1Field(), webDriver);
        DataHelperAndWait.updateAllText(this.getStreet1Field(), streetLineOne);
        guestCheckoutCyclePage.selectCity();
        if(webDriver.getCurrentUrl().contains("en-jo")) {
        DataHelperAndWait.waitToBeVisible(this.getStreet2Field(), webDriver);
        DataHelperAndWait.updateAllText(this.getStreet2Field(), streetLineTwo);
        }
        if(webDriver.getCurrentUrl().contains("-qa/")){
            QatarMyAccountPage qatarMyAccountPage= new QatarMyAccountPage(webDriver);
            qatarMyAccountPage.selectFirstOptionInAreaMenu();
        }
        DataHelperAndWait.waitToBeVisible(this.getNationalIdField(), webDriver);
        DataHelperAndWait.updateAllText(this.getNationalIdField(), nationalId);
    }
    public void fillInNewAddressFormWithIncorrectPhone(String firstName, String lastName, String phone, String addressName, String streetLineOne, String streetLineTwo, String nationalId) {
        GuestCheckoutCyclePage guestCheckoutCyclePage= new GuestCheckoutCyclePage(webDriver);
        DataHelperAndWait.waitToBeVisible(this.getFirstNameFieldInAddress(), webDriver);
        DataHelperAndWait.updateAllText(this.getFirstNameFieldInAddress(), firstName);
        DataHelperAndWait.waitToBeVisible(this.getLastNameFieldInAddress(), webDriver);
        DataHelperAndWait.updateAllText(this.getLastNameFieldInAddress(), lastName);
        DataHelperAndWait.waitToBeVisible(this.getPhoneFieldInAddress(), webDriver);
        DataHelperAndWait.updateAllText(this.getPhoneFieldInAddress(), phone);
        DataHelperAndWait.waitForTime(500);
        DataHelperAndWait.waitToBeVisible(this.getAddressNameField(), webDriver);
        DataHelperAndWait.updateAllText(this.getAddressNameField(), addressName);
        DataHelperAndWait.waitToBeVisible(this.getStreet1Field(), webDriver);
        DataHelperAndWait.updateAllText(this.getStreet1Field(), streetLineOne);
//        getPhoneFieldInAddress().click();
//        getPhoneFieldInAddress().sendKeys("2");
        guestCheckoutCyclePage.selectCity();
        if(webDriver.getCurrentUrl().contains("en-jo")) {
            DataHelperAndWait.waitToBeVisible(this.getStreet2Field(), webDriver);
            DataHelperAndWait.updateAllText(this.getStreet2Field(), streetLineTwo);
        }
        if(webDriver.getCurrentUrl().contains("-qa/")){
            QatarMyAccountPage qatarMyAccountPage= new QatarMyAccountPage(webDriver);
            qatarMyAccountPage.selectFirstOptionInAreaMenu();
        }
        DataHelperAndWait.waitToBeVisible(this.getNationalIdField(), webDriver);
        DataHelperAndWait.updateAllText(this.getNationalIdField(), nationalId);
    }
}
