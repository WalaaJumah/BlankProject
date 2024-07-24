/**
 * @author w.jumaa
 * @projectName EurekaJo_Automation
 * @classDescription
 */

package site_pages.login;

import core.BasePage;
import helper_classes.AssertionHelper;
import helper_classes.ElementHelper;
import helper_classes.WaitHelper;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Optional;

import java.util.List;

@Getter
public class ArabicLoginPage extends BasePage {
    By phoneNumberField = By.id("PhoneNumber");
    By passwordField = By.id("Password");
    By signUpBtn = By.id("Register");
    By loginBtn = By.id("submit");
    By myPropritisTab = By.id("profile-tab");
    By rememberMeCheckBox = By.id("RememberMe");
    By forgetPassword = By.id("ForgotPassword");
    By loginForm = By.id("form-login");
    By phoneNumberInLogin = By.id("PhoneNumber");
    By logoutOption = By.id("HeaderSubMenu_Logout");
    By profileImage = By.id("imagePreview");
    By profileMenu = By.partialLinkText("(//div[starts-with(@class, 'profile-login')])[1]");
    By myProfileOption = By.xpath("(//a[@href='/UserProfile/index'])[2]");
    By rememberMeLabel = By.xpath("//label[@for='RememberMe']");
    By loginTitle = By.xpath("//h2");
    By countryCodeField = By.xpath("//div[@class='iti__selected-flag']");
    By countryCodeArrowIcon = By.xpath("//div[@class='iti__arrow']");
    By selectedCountry = By.xpath("//div[@class='iti__selected-dial-code']");
    By registerSection = By.xpath("//a[@id='Register']/..");
    By errorMsg = By.xpath("//div[@class='validation-summary-errors text-danger']");
    By phoneNumberErrorMsg = By.id("PhoneNumber-error");
    By passwordErrorMsg = By.id("Password-error");
    By profileIcon = By.xpath("(//div[contains(@class,'profile-login')])[1]");
    By hidePasswordIcon = By.xpath("//i[@class='fa fa-eye-slash']");
    By loginIcon = By.xpath("//i[@class='bi bi-person']");
    By countriesList = By.id("iti-0__country-listbox");
    List<WebElement> countries = webDriver.findElements(countriesList);
    public ArabicLoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void login(String phoneNumber, String password) {
        ElementHelper.typeTextInElement(phoneNumberField, webDriver, phoneNumber);
        ElementHelper.typeTextInElement(passwordField, webDriver, password);
        ElementHelper.clickOnElement(loginBtn, webDriver);
        verifyTheDisplayedPageDoesNotHaveErrors();
        WaitHelper.waitToBeVisible(profileIcon, webDriver);
        AssertionHelper.validateTheElementIsDisplayed(profileIcon, webDriver);

    }

    public void fillLoginForm(@Optional String phoneNumber, String password) {
        ElementHelper.typeTextInElement(phoneNumberField, webDriver, phoneNumber);
        ElementHelper.typeTextInElement(passwordField, webDriver, password);
        ElementHelper.clickOnElement(loginBtn, webDriver);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }

    public void logout() {
        ElementHelper.JsExecutorToClickOnElement(profileIcon, webDriver);
        ElementHelper.JsExecutorToClickOnElement(logoutOption, webDriver);
        navigateToLoginLink();
        AssertionHelper.validateTheElementIsDisplayed(passwordField, webDriver);
    }


}
