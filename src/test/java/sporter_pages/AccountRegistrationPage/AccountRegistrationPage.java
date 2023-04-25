/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription AccountRegistrationPage
 */

package sporter_pages.AccountRegistrationPage;

import core.BasePage;
import core.DataHelperAndWait;
import error_helper.SporterErrorPage;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import sporter_pages.headerSection.HeaderSection;

import java.io.IOException;

@Getter
public class AccountRegistrationPage extends BasePage {
    DataHelperAndWait dataHelperAndWait;
    HeaderSection headerSection = new HeaderSection(webDriver);
    @FindBy(id = "signupBtn")
    private WebElement createAccountOption;
    @FindBy(id = "toSignupBtn")
    private WebElement createAnAccountTab;
    @FindBy(id = "toLoginBtn")
    private WebElement haveAnAccountTab;
    @FindBy(id = "email_input")
    private WebElement emailField;
    @FindBy(id = "password_input")
    private WebElement passwordField;
    @FindBy(id = "confirm_password_input")
    private WebElement confirmPasswordField;
    @FindBy(id = "submitBtn")
    private WebElement createAccountBtn;
    @FindBy(id = "showPasswordIcon")
    private WebElement showPasswordIcon;
    @FindBy(id = "hidePasswordIcon")
    private WebElement HidePasswordIcon;
    @FindBy(css = "#signupForm > div:nth-child(7) > div > svg > path")
    private WebElement eyeIconOnConfirmPassword;
    @FindBy(id = "loginLink")
    private WebElement signInLink;
    @FindBy(xpath = "//div[@class='firstForm_CAccountLabel__3I8wI']")
    private WebElement alreadyHaveAccountLabel;
    @FindBy(id = "FBLabel")
    private WebElement signInWithSocialMediaLabel;
    @FindBy(id = "FBSignUp")
    private WebElement signInUsingFacebookBtn;
    @FindBy(id = "email_input_errMsg")
    private WebElement emailErrorMs;
    @FindBy(id = "password_input_errMsg")
    private WebElement passwordErrorMsg;
    @FindBy(id = "confirm_password_input_errMsg")
    private WebElement confirmPasswordErrorMsg;
    @FindBy(id = "firstNameInput")
    private WebElement firstNameField;
    @FindBy(id = "lastNameInput")
    private WebElement lastNameField;
    @FindBy(id = "1")
    private WebElement maleOption;
    @FindBy(id = "2")
    private WebElement femaleOption;
    @FindBy(id = "firstNameInput_errMsg")
    private WebElement firstNameErrorMs;
    @FindBy(id = "lastNameInput_errMsg")
    private WebElement lastNameErrorMs;
    @FindBy(id = "myAccountBtn")
    private WebElement myAccountOption;
    @FindBy(xpath = "(//input[@class='input_input__qEHaZ'])[3]")
    private WebElement emailAddressFieldInAccountInformation;
    @FindBy(id = "signUpHeader")
    private WebElement becomeASporterHeader;
    @FindBy(id = "loginHeader")
    private WebElement WelcomeToSporterHeader;
    @FindBy(id = "createAccountLabel")
    private WebElement createAnAccountLabel;
    @FindBy(id = "submitSecondForm")
    private WebElement submitBtn;
    @FindBy(id = "logOutBtn")
    private WebElement logoutOption;
    //TODO: There's a bug due to this error should not appear
    @FindBy(xpath = "//div[@class='firstForm_serverError__HATCJ']")
    private WebElement emailUsedMsg;
    @FindBy(id = "email")
    private WebElement faceBookEmail;
    @FindBy(id = "pass")
    private WebElement faceBookPassword;
    @FindBy(id = "loginbutton")
    private WebElement loginInFaceBookPage;
    @FindBy(id = "swiperSlideimg_0")
    private WebElement successfulMsg;
    public AccountRegistrationPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }

    public void verifyFaceBookIsActive() throws IOException {
        verifyTheDisplayedPageDoesNotHaveErrors();
        Assert.assertFalse(this.getSourcePage().contains(SporterErrorPage.facebookError), "FaceBook is inactive " + webDriver.getCurrentUrl());
    }


    public void navigateToRegistrationPage() throws IOException {
        webDriver.navigate().to(BaseURL + registerAccountLink);
        verifyTheDisplayedPageDoesNotHaveErrors();
        try {
            if (this.getLastNameField().isDisplayed()) {
                webDriver.navigate().refresh();
                verifyTheDisplayedPageDoesNotHaveErrors();
            }
        } catch (Exception e) {
            e.getMessage();
        }
        verifyTheDisplayedPageDoesNotHaveErrors();
    }

    public void logout() {
        try {
            DataHelperAndWait.hoverOnElementAndClick(headerSection.getAccountProfileIcon(), webDriver);
            DataHelperAndWait.hoverOnElementAndClick(this.getLogoutOption(), webDriver);
        } catch (Exception e) {
            DataHelperAndWait.clickOnElement(headerSection.getAccountProfileIcon(), webDriver);
            DataHelperAndWait.clickOnElement(this.getLogoutOption(), webDriver);
        }
    }

    public void fillInCreateAccountForm(String email, String password, String confirmPassword) {
        DataHelperAndWait.typeTextInElement(this.getEmailField(), webDriver, email);
        DataHelperAndWait.typeTextInElement(this.getPasswordField(), webDriver, password);
        DataHelperAndWait.typeTextInElement(this.getConfirmPasswordField(), webDriver, password);
    }

    public void fillInExtraInformationForm(String firstName, String lastName) {
        DataHelperAndWait.typeTextInElement(this.getFirstNameField(), webDriver, firstName);
        DataHelperAndWait.typeTextInElement(this.getLastNameField(), webDriver, lastName);
    }

    public void submitAllCreateAccountFormsCorrectly(String email, String password, String confirmPassword, String firstName, String lastName, int gender) throws IOException {
        DataHelperAndWait.typeTextInElement(this.getEmailField(), webDriver, email);
        DataHelperAndWait.typeTextInElement(this.getPasswordField(), webDriver, password);
        DataHelperAndWait.typeTextInElement(this.getConfirmPasswordField(), webDriver, password);
        DataHelperAndWait.clickOnElement(this.getCreateAccountBtn(), webDriver);
        DataHelperAndWait.typeTextInElement(this.getFirstNameField(), webDriver, firstName);
        DataHelperAndWait.typeTextInElement(this.getLastNameField(), webDriver, lastName);
        if (gender == 1) {
            DataHelperAndWait.hoverOnElementAndClick(this.getMaleOption(), webDriver);
        }
        if (gender == 2) {
            DataHelperAndWait.hoverOnElementAndClick(this.getFemaleOption(), webDriver);
        }
        if (gender == 0) {
            gender = 0;
        }
        DataHelperAndWait.clickOnElement(this.getSubmitBtn(), webDriver);
        this.verifyTheDisplayedPageDoesNotHaveErrors();
//        DataHelperAndWait.waitForTime(3000);
    }
    public void submitAllCreateAccountFormsWrongly(String email, String password, String confirmPassword, String firstName, String lastName, int gender) {
        DataHelperAndWait.typeTextInElement(this.getEmailField(), webDriver, email);
        DataHelperAndWait.typeTextInElement(this.getPasswordField(), webDriver, password);
        DataHelperAndWait.typeTextInElement(this.getConfirmPasswordField(), webDriver, password);
        DataHelperAndWait.clickOnElement(this.getCreateAccountBtn(), webDriver);
        DataHelperAndWait.typeTextInElement(this.getFirstNameField(), webDriver, firstName);
        DataHelperAndWait.typeTextInElement(this.getLastNameField(), webDriver, lastName);
        if (gender == 1) {
            DataHelperAndWait.hoverOnElementAndClick(this.getMaleOption(), webDriver);
        }
        if (gender == 2) {
            DataHelperAndWait.hoverOnElementAndClick(this.getFemaleOption(), webDriver);
        }
        if (gender == 0) {
            gender = 0;
        }
        DataHelperAndWait.clickOnElement(this.getSubmitBtn(), webDriver);
//        DataHelperAndWait.waitForTime(3000);
    }
    public void fillingAllCreateAccountForms(String email, String password, String confirmPassword, String firstName, String lastName, int gender) {
        DataHelperAndWait.typeTextInElement(this.getEmailField(), webDriver, email);
        DataHelperAndWait.typeTextInElement(this.getPasswordField(), webDriver, password);
        DataHelperAndWait.typeTextInElement(this.getConfirmPasswordField(), webDriver, password);
        DataHelperAndWait.clickOnElement(this.getCreateAccountBtn(), webDriver);
        DataHelperAndWait.typeTextInElement(this.getFirstNameField(), webDriver, firstName);
        DataHelperAndWait.typeTextInElement(this.getLastNameField(), webDriver, lastName);
        if (gender == 1) {
            DataHelperAndWait.hoverOnElementAndClick(this.getMaleOption(), webDriver);
        }
        if (gender == 2) {
            DataHelperAndWait.hoverOnElementAndClick(this.getFemaleOption(), webDriver);
        }
        DataHelperAndWait.clickOnElement(this.getSubmitBtn(), webDriver);
    }
}