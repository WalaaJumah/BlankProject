/**
 * @author w.jumaa
 * @projectName EurekaJo_Automation
 * @classDescription
 */

package site_pages.signup;

import core.BasePage;
import helper_classes.ElementHelper;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Getter
public class SignUpPage extends BasePage {
    public SignUpPage(WebDriver webDriver) {
        super(webDriver);
    }
    By signUpForm= By.id("form-register");
    By phoneNumberPlaceHolder= By.id("phone_placholder");
    By passwordField= By.id("Password");
    By phoneNumberField= By.id("PhoneNumber");
    By countryCodeList= By.xpath("//ul[@id='iti-0__country-listbox']");
    By phoneNumberAlreadyRegisteredMsg= By.xpath("//div[@class='text-danger validation-summary-errors']");
    By countryCodeField= By.xpath("//div[@class='iti__selected-flag']");
    By confirmPasswordField= By.id("ConfirmPassword");
    By acceptTermsAndConditionsLink= By.id("AcceptTermsAndConditions");
    By registerCaptchaSection= By.id("RegisterCaptcha");
    By signupBtn= By.id("SubSave");
    By signUpTitle= By.xpath("//div[@class='row']//h2");
    By confirmPhoneNumberByLabel= By.xpath("//div[contains(@class,'confirm-register-method')]/b");
    By whatsAppOption= By.id("radio-WhatsApp");
    By smsOption= By.id("radio-SMS");
    By signInOption= By.id("SignIn");
    By termsAndConditionsCheckBox= By.id("check-1");
    By showHidePasswordIcon= By.xpath("(//span[@class='password-show']/i)[1]");
    By showHideConfirmedPasswordIcon= By.xpath("(//span[@class='password-show']/i)[2]");
    By signInSection= By.xpath("//a[@id='SignIn']/..");
    By recaptchaErrorMsg= By.xpath("//span[@id='captcha-error']/span");
    By whatsappOptionLabel= By.xpath("(//div[@class='form-group d-inline-block']//label)[1]");
    By smsOptionLabel= By.xpath("(//div[@class='form-group d-inline-block']//label)[2]");
    By termsAndConditionsErrorMsg= By.id("AcceptTermsAndConditions-error");
    By termsAndConditionsErrorMsg2= By.id("terms-error");
    By recaptchaImages= By.id("rc-imageselect");

    public void clickOnSignUpBtn(){
        ElementHelper.clickOnElement(signupBtn,webDriver);
        verifyTheDisplayedPageDoesNotHaveErrors();
    }
    public void fillInSignUpForm(String phoneNumber,String password, Boolean useSMSOption, Boolean confirmedPassword){
        ElementHelper.typeTextInElement(phoneNumberField,webDriver,phoneNumber);
        if(!useSMSOption)
            ElementHelper.JsExecutorToClickOnElement(whatsAppOption,webDriver);
        ElementHelper.typeTextInElement(passwordField,webDriver,password);
        if(confirmedPassword)
        ElementHelper.typeTextInElement(confirmPasswordField,webDriver,password);
        else
            ElementHelper.typeTextInElement(confirmPasswordField,webDriver,"WrongPassword");
    }

    public void clickOnAcceptTermsAndConditions(){
        ElementHelper.clickOnElement(acceptTermsAndConditionsLink,webDriver);
    }
     public void selectTermsAndConditions(){
        ElementHelper.JsExecutorToClickOnElement(termsAndConditionsCheckBox,webDriver);
    }

     public void clickOnReCaptcha(){
        ElementHelper.clickOnElement(registerCaptchaSection,webDriver);
    }

    public void clickOnShowHidePasswordIcon(){
        ElementHelper.clickOnElement(showHideConfirmedPasswordIcon,webDriver);
    }

}
