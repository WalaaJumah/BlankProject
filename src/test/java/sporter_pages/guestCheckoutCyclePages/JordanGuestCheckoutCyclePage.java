/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription GuestCheckoutCyclePage
 */

package sporter_pages.guestCheckoutCyclePages;

import core.DataHelperAndWait;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import xml_reader.XmlReader;

@Getter
public class JordanGuestCheckoutCyclePage extends  GuestCheckoutCyclePage{
    public JordanGuestCheckoutCyclePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    @FindBy(xpath = "(//div[@id='_errMsg'])[4]")
    private WebElement nationalIdErrMsg;
    @FindBy(xpath = "(//div[@id='_errMsg'])[5]")
    private WebElement streetLineOneErrMsg;
    @FindBy(xpath = "(//div[@id='_errMsg'])[6]")
    private WebElement streetLineErrMsg;
    @FindBy(xpath = "(//input[starts-with(@class,'input_input')])[4]")
    private WebElement nationalIDField;
    @FindBy(xpath = "(//input[starts-with(@class,'input_input')])[5]")
    private WebElement addressNameField;
    @FindBy(xpath = "(//input[starts-with(@class,'input_input')])[6]")
    private WebElement streetLineOneField;
    @FindBy(xpath = "(//input[starts-with(@class,'input_input')])[7]")
    private WebElement streetLineTwoField;

    public void fillInShippingInformationInputField(String firstName, String lastName, String email, String phone, String address, String streetLineOne, String streetLineTwo, String nationaLID) {
        DataHelperAndWait.waitToBeVisible(getFirstNameField() ,webDriver);
        DataHelperAndWait.updateAllText(getFirstNameField(),firstName);
        DataHelperAndWait.waitToBeVisible(getLastNameField() ,webDriver);
        DataHelperAndWait.updateAllText(getLastNameField(),lastName);
        DataHelperAndWait.waitToBeVisible(getEmailField() ,webDriver);
        DataHelperAndWait.updateAllText(getEmailField(),email);
        DataHelperAndWait.waitToBeVisible(getPhoneField() ,webDriver);
        DataHelperAndWait.updateAllText(getPhoneField(),phone);
        DataHelperAndWait.waitToBeVisible(addressNameField ,webDriver);
        DataHelperAndWait.updateAllText(addressNameField,address);
        DataHelperAndWait.waitToBeVisible(streetLineOneField ,webDriver);
        DataHelperAndWait.updateAllText(streetLineOneField,streetLineOne);
        DataHelperAndWait.waitToBeVisible(streetLineTwoField ,webDriver);
        DataHelperAndWait.updateAllText(streetLineTwoField,streetLineTwo);
        DataHelperAndWait.waitToBeVisible(nationalIDField ,webDriver);
        DataHelperAndWait.updateAllText(nationalIDField,streetLineTwo);

    }
    public void navigateToShippingMethodsPage(){
        this.accessGuestCheckoutForm();
        this.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"),
                XmlReader.getXMLData("nationalID")
        );
        this.setSelectDubaiCityCity();
        this.clickOnContinueBtn();
    }

}
