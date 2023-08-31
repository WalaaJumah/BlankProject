/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription
 */

package sporter_pages.myAccountPages;

import core.BasePage;
import core.DataHelperAndWait;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sporter_pages.guestCheckoutCyclePages.GuestCheckoutCyclePage;

@Getter
public class MyAccountPage extends BasePage {
    private String myAccountURL = "/dashboard/my_account";
    private String recentOrdersURL = "/dashboard/recent_orders";
    private String allOrdersURL = "/dashboard/all_orders";
    private String newsletterURL = "/dashboard/newsletter";
    private String addressedUrl = "/dashboard/my_addresses";
    @FindBy(id = "myAccountBtn")
    private WebElement myAccountOption;
    @FindBy(id = "recentOrdersBtn")
    private WebElement myOrdersOption;
    @FindBy(id = "myReardsBtn")
    private WebElement myRewardsOption;
    @FindBy(id = "logOutBtn")
    private WebElement logoutOption;
    @FindBy(id = "UserIconContainer")
    private WebElement accountProfileIcon;
    @FindBy(id = "saveProfileBtn")
    private WebElement saveAccountInfoBtn;
    @FindBy(id = "firstnameField")
    private WebElement firstNameField;
    @FindBy(id = "lastnameField")
    private WebElement lastNameField;
    @FindBy(id = "emailField")
    private WebElement emailField;
    @FindBy(id = "password")
    private WebElement oldPasswordField;
    @FindBy(id = "newPassword")
    private WebElement newPasswordField;
    @FindBy(id = "confirmPassword")
    private WebElement confirmNebPasswordField;
    @FindBy(id = "genderMale")
    private WebElement maleGender;
    @FindBy(id = "genderFemale")
    private WebElement femaleGender;
    @FindBy(id = "changePassword")
    private WebElement changePasswordBox;
    @FindBy(id = "box")
    private WebElement generalSubscriptionOption;
    @FindBy(xpath = "//button[contains(@class,'newsLetter_btn')]")
    private WebElement submitNewsLetterBtn;
    @FindBy(xpath = "(//a[contains(@class,'productItem_productName')])[1]")
    private WebElement productNameInOrdersPage;
    @FindBy(xpath = "(//a[contains(@class,'order_link')])[1]")
    private WebElement orderDetailsBtn;
    @FindBy(xpath = "(//a[contains(@class,'order_link')])[2]")
    private WebElement invoiceBtn;
    @FindBy(xpath = "(//div[contains(@class,'orderPage_orderInfo')])[1]")
    private WebElement orderInfoSection;
    @FindBy(xpath = "(//a[contains(@class,'orderPage_print')])[1]")
    private WebElement orderPrintBtn;
    @FindBy(xpath = "(//span[contains(@class,'allOrders_type')])[1]")
    private WebElement ordersTab;
    @FindBy(xpath = "(//span[contains(@class,'allOrders_type')])[2]")
    private WebElement openOrdersTab;
    @FindBy(xpath = "(//span[contains(@class,'allOrders_type')])[3]")
    private WebElement canceledOrdersTab;
    @FindBy(id = "addAddress")
    private WebElement addNewAddressBtn;
    @FindBy(xpath = "(//a[@id='editLabel'])[1]")
    private WebElement editAddressBtn;
    @FindBy(id = "firstnameField")
    private WebElement firstNameFieldInAddress;
    @FindBy(id = "lastnameField")
    private WebElement lastNameFieldInAddress;
    @FindBy(id = "phoneNumber")
    private WebElement phoneFieldInAddress;
    @FindBy(id = "addressNameField")
    private WebElement addressNameField;
    @FindBy(id = "street1Field")
    private WebElement street1Field;
    @FindBy(id = "street2Field")
    private WebElement street2Field;
    @FindBy(xpath = "//button[contains(@class,'newAddress_btn')]")
    private WebElement saveAddressBtn;
    @FindBy(xpath = "//button[contains(@class,'editAddress_btn')]")
    private WebElement saveEditAddressBtn;
    @FindBy(id = "nationalIdField")
    private WebElement nationalIdField;
    @FindBy(id = "countryCode")
    private WebElement countryCodeField;
    @FindBy(id = "countrySelector")
    private WebElement countryField;
    public MyAccountPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public void navigateToMyAccountPage() {
        webDriver.navigate().to(BaseURL + myAccountURL);
        DataHelperAndWait.waitForUrlContains(myAccountURL, webDriver);
    }

    public void navigateToMyOrdersPage() {
        webDriver.navigate().to(BaseURL + recentOrdersURL);
        DataHelperAndWait.waitForUrlContains(recentOrdersURL, webDriver);
    }

    public void navigateToAllOrdersPage() {
        webDriver.navigate().to(BaseURL + allOrdersURL);
        DataHelperAndWait.waitForUrlContains(allOrdersURL, webDriver);
    }

    public void navigateToNewsLetterSubscriptionPage() {
        webDriver.navigate().to(BaseURL + newsletterURL);
        DataHelperAndWait.waitForUrlContains(newsletterURL, webDriver);
    }

    public void navigateToAddressesPage() {
        webDriver.navigate().to(BaseURL + addressedUrl);
        DataHelperAndWait.waitForUrlContains(addressedUrl, webDriver);
    }

    public void fillInNewAddressForm(String firstName, String lastName, String phone, String addressName, String streetLineOne, String streetLineTwo) {
        GuestCheckoutCyclePage guestCheckoutCyclePage=new GuestCheckoutCyclePage(webDriver);
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
        DataHelperAndWait.waitToBeVisible(this.getStreet2Field(), webDriver);
        DataHelperAndWait.updateAllText(this.getStreet2Field(), streetLineTwo);
        guestCheckoutCyclePage.selectCity();
    }
    public void fillInNewAddressFormWithIncorrectPhone(String firstName, String lastName, String phone, String addressName, String streetLineOne, String streetLineTwo) {
        GuestCheckoutCyclePage guestCheckoutCyclePage= new GuestCheckoutCyclePage(webDriver);
        DataHelperAndWait.waitForTime(500);
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
    }
}
