/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.guestCheckoutCyclePages;

import core.DataHelperAndWait;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sporter_pages.cartPages.CartPage;
import xml_reader.XmlReader;

@Getter
public class QatarGuestCheckoutCyclePage extends GuestCheckoutCyclePage {
    @FindBy(id = "flatrate")
    WebElement fourToFiveDayMethod;
    @FindBy(id = "nationalIdField_errMsg")
    private WebElement nationalIdErrMsg;
    @FindBy(id = "lastnameField_errMsg")
    private WebElement lastNameErrMsg;
    @FindBy(id = "emailField_errMsg")
    private WebElement emailErrMsg;
    @FindBy(xpath = "//div[starts-with(@class,'teleInput_errorMsg')]")
    private WebElement phoneErrMsg;
    @FindBy(id = "addressNameField_errMsg")
    private WebElement addressErrMsg;
    @FindBy(id = "firstnameField_errMsg")
    private WebElement firstnameErrMsg;
    @FindBy(id = "street1Field_errMsg")
    private WebElement streetlineOneErrMsg;
    @FindBy(id = "nationalIdField")
    private WebElement nationalIDField;
    @FindBy(xpath = "(//input[starts-with(@class,'input_input')])[5]")
    private WebElement addressNameField;
    @FindBy(id = "street1Field")
    private WebElement streetLineOneField;
    @FindBy(id = "street2Field")
    private WebElement streetLineTwoField;
    public QatarGuestCheckoutCyclePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public void fillInShippingInformationInputField(String firstName, String lastName, String email, String phone, String streetLineOne, String streetLineTwo, String nationaLID) {
        DataHelperAndWait.waitToBeVisible(getFirstNameField(), webDriver);
        DataHelperAndWait.updateAllText(getFirstNameField(), firstName);
        DataHelperAndWait.waitToBeVisible(getLastNameField(), webDriver);
        DataHelperAndWait.updateAllText(getLastNameField(), lastName);
        DataHelperAndWait.waitToBeVisible(getEmailField(), webDriver);
        DataHelperAndWait.updateAllText(getEmailField(), email);
        DataHelperAndWait.waitToBeVisible(getPhoneField(), webDriver);
        DataHelperAndWait.updateAllText(getPhoneField(), phone);
//        DataHelperAndWait.waitToBeVisible(addressNameField ,webDriver);
//        DataHelperAndWait.updateAllText(addressNameField,address);
        DataHelperAndWait.waitToBeVisible(streetLineOneField, webDriver);
        DataHelperAndWait.updateAllText(streetLineOneField, streetLineOne);
        DataHelperAndWait.waitToBeVisible(streetLineTwoField, webDriver);
        DataHelperAndWait.updateAllText(streetLineTwoField, streetLineTwo);
        DataHelperAndWait.waitToBeVisible(nationalIDField, webDriver);
        DataHelperAndWait.updateAllText(nationalIDField, nationaLID);

    }

    public void navigateToShippingMethodsPage() {
        this.accessGuestCheckoutForm();
        this.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"),
                XmlReader.getXMLData("nationalID")
        );
        this.setSelectDubaiCityCity();
        this.clickOnContinueBtn();
    }

    public void viewCartAndAccessShippingMethodsPage() {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.navigateToCartPage();
        this.accessGuestCheckoutForm();
        this.fillInShippingInformationInputField(
                XmlReader.getXMLData("firstName"),
                XmlReader.getXMLData("lastName"),
                XmlReader.getXMLData("correctEmail"),
                XmlReader.getXMLData("phoneNumber"),
//                XmlReader.getXMLData("AddressName"),
                XmlReader.getXMLData("StreetOneAddressName"),
                XmlReader.getXMLData("StreetTwoAddressName"),
                XmlReader.getXMLData("nationalID")
        );
        this.setSelectDubaiCityCity();
        this.clickOnContinueBtn();
    }

}
