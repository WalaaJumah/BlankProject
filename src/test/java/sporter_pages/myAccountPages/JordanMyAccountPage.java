/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.myAccountPages;

import core.DataHelperAndWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class JordanMyAccountPage extends MyAccountPage{
    public JordanMyAccountPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    public void fillInNewAddressForm(String firstName, String lastName, String phone, String addressName, String streetLineOne, String streetLineTwo, String nationalId) {
        DataHelperAndWait.waitToBeVisible(this.getFirstNameFieldInAddress(),webDriver);
        DataHelperAndWait.updateAllText(this.getFirstNameFieldInAddress(),firstName);
        DataHelperAndWait.waitToBeVisible(this.getLastNameFieldInAddress() ,webDriver);
        DataHelperAndWait.updateAllText(this.getLastNameFieldInAddress(),lastName);
        DataHelperAndWait.waitToBeVisible(this.getPhoneFieldInAddress() ,webDriver);
        DataHelperAndWait.updateAllText(this.getPhoneFieldInAddress(),phone);
        DataHelperAndWait.waitToBeVisible(this.getAddressNameField() ,webDriver);
        DataHelperAndWait.updateAllText(this.getAddressNameField(),addressName);
        DataHelperAndWait.waitToBeVisible(this.getStreet1Field() ,webDriver);
        DataHelperAndWait.updateAllText(this.getStreet1Field(),streetLineOne);
        DataHelperAndWait.waitToBeVisible(this.getStreet2Field() ,webDriver);
        DataHelperAndWait.updateAllText(this.getStreet2Field(),streetLineTwo);
        DataHelperAndWait.waitToBeVisible(this.getNationalIdField() ,webDriver);
        DataHelperAndWait.updateAllText(this.getNationalIdField(),streetLineTwo);
    }
}
