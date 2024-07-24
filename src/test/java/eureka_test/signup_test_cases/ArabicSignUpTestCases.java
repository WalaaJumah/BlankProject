/**
 * @author w.jumaa
 * @projectName EurekaJo_Automation
 * @classDescription
 */

package eureka_test.signup_test_cases;

import core.BaseTest;
import site_pages.signup.SignUpPage;
import helper_classes.AssertionHelper;
import helper_classes.DataExtractor;
import helper_classes.ElementHelper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import xml_reader.XmlReader;

@Test(groups = "2.03  SignUp Page")
public class ArabicSignUpTestCases extends BaseTest {
    public ArabicSignUpTestCases() {
        Language = "Ar";
    }

    @Test(groups = {"Priority 2 Modules", "1.1 Critical Severity"}, description = "{{CountryName}}: verify the user is able to navigate to the Sign Up correctly", priority = 1)
    public void verifyNavigationToSignUp() {
        SignUpPage signUpPage = new SignUpPage(webDriver);
        signUpPage.navigateToSignUpLink();
        AssertionHelper.validateTheElementIsDisplayed(signUpPage.getPasswordField(), webDriver);
    }

    @Test(groups = {"Priority 2 Modules", "1.1 Critical Severity"}, description = "{{CountryName}}: verify Sign Up page contains all fields,sections & Links", priority = 2)
    public void verifySignUpPageContainAllComponents() {
        SignUpPage signUpPage = new SignUpPage(webDriver);
        AssertionHelper.validateTheElementIsDisplayed(signUpPage.getSignUpForm(), webDriver);
        AssertionHelper.validateTheElementIsDisplayed(signUpPage.getSignUpTitle(), webDriver);
        AssertionHelper.validateTheElementIsDisplayed(signUpPage.getPhoneNumberField(), webDriver);
        AssertionHelper.validateTheElementIsDisplayed(signUpPage.getPasswordField(), webDriver);
        AssertionHelper.validateTheElementIsDisplayed(signUpPage.getConfirmPasswordField(), webDriver);
        AssertionHelper.validateTheElementIsDisplayed(signUpPage.getAcceptTermsAndConditionsLink(), webDriver);
        AssertionHelper.validateTheElementIsDisplayed(signUpPage.getRegisterCaptchaSection(), webDriver);
        AssertionHelper.validateTheElementIsDisplayed(signUpPage.getSignupBtn(), webDriver);
        AssertionHelper.validateTheElementIsDisplayed(signUpPage.getSignInOption(), webDriver);
        AssertionHelper.validateTheElementIsDisplayed(signUpPage.getSignInSection(), webDriver);
    }

    @Test(groups = {"Priority 2 Modules", "1.1 Critical Severity"}, description = "{{CountryName}}: verify the name of all fields/Labels/Titles in the Sign Up page are correct", priority = 3)
    public void verifyAllLabelAndTitlesAppearCorrectly() {
        SignUpPage signUpPage = new SignUpPage(webDriver);
        AssertionHelper.assertionWebElementEqualText(signUpPage.getSignUpTitle(), webDriver, XmlReader.getXMLData("SignUpTitle" + Language));
        AssertionHelper.assertionWebElementEqualText(signUpPage.getPhoneNumberPlaceHolder(), webDriver, XmlReader.getXMLData("PhoneNumberFieldName" + Language));
        AssertionHelper.assertionWebElementEqualText(signUpPage.getConfirmPhoneNumberByLabel(), webDriver, XmlReader.getXMLData("confirmPhoneNumberByLabel" + Language));
        AssertionHelper.assertionWebElementEqualText(signUpPage.getWhatsappOptionLabel(), webDriver, XmlReader.getXMLData("whatsAppOption"));
        AssertionHelper.assertionWebElementEqualText(signUpPage.getSmsOptionLabel(), webDriver, XmlReader.getXMLData("SMSOption"));
        AssertionHelper.assertionWebElementEqualText(signUpPage.getAcceptTermsAndConditionsLink(), webDriver, XmlReader.getXMLData("termsAndConditionsLabel" + Language));
    }

    @Test(groups = {"Priority 2 Modules", "1.1 Critical Severity"}, description = "{{CountryName}}: Make sure the site saves the entered password correctly to allow the user to login using the entered credentials", priority = 4)
    public void verifySiteSavesPasswordCorrectly() {
        SignUpPage signUpPage = new SignUpPage(webDriver);
        signUpPage.navigateToSignUpLink();
        ElementHelper.typeTextInElement(signUpPage.getPasswordField(), webDriver, XmlReader.getXMLData("signUpPassword"));
        webDriver.findElement(signUpPage.getShowHidePasswordIcon()).click();
        ElementHelper.clickOnElement(signUpPage.getPasswordField(), webDriver);
        webDriver.findElement(signUpPage.getPasswordField()).sendKeys(Keys.chord(Keys.CONTROL, "a")); // Select all text
        webDriver.findElement(signUpPage.getPasswordField()).sendKeys(Keys.chord(Keys.CONTROL, "c")); // Copy selected text

        // Focus on phone number field
        WebElement phoneNumberField = webDriver.findElement(signUpPage.getPhoneNumberField());
        phoneNumberField.click(); // Ensure focus on phone number field
        phoneNumberField.sendKeys(Keys.chord(Keys.CONTROL, "v"));
        Assert.assertTrue(DataExtractor.matchPasswords(XmlReader.getXMLData("signUpPassword"), phoneNumberField.getAttribute("value")), "The entered password is: " + XmlReader.getXMLData("signUpPassword") + " while the site saved this password: " + phoneNumberField.getAttribute("value"));
    }

    @Test(groups = {"Priority 2 Modules", "1.1 Critical Severity"}, description = "{{CountryName}}: verify inability to signup without accepting the terms & conditions & the site will display validation message", priority = 5)
    public void verifyInAbilityToSignUpWithoutAcceptingTermsAndConditions() {
        SignUpPage signUpPage = new SignUpPage(webDriver);
        signUpPage.navigateToSignUpLink();
        ElementHelper.clickOnElement(signUpPage.getSignupBtn(), webDriver);
        AssertionHelper.validateTheElementIsDisplayed(signUpPage.getTermsAndConditionsErrorMsg2(), webDriver);
        AssertionHelper.validateTheElementIsDisplayed(signUpPage.getTermsAndConditionsErrorMsg(), webDriver);
    }

    @Test(groups = {"Priority 2 Modules", "1.1 Critical Severity"}, description = "{{CountryName}}: verify inability to signup without checking the ReCaptcha & the site will display validation message", priority = 6)
    public void verifyInAbilityToSignUpWithoutAcceptingReCaptcha() {
        SignUpPage signUpPage = new SignUpPage(webDriver);
        signUpPage.navigateToSignUpLink();
        ElementHelper.clickOnElement(signUpPage.getSignupBtn(), webDriver);
        AssertionHelper.validateTheElementIsDisplayed(signUpPage.getRecaptchaErrorMsg(), webDriver);
    }

    @Test(groups = {"Priority 2 Modules", "1.3 Medium Severity"}, description = "{{CountryName}}: Verify show password icon works correctly", priority = 7)
    public void verifyShowPasswordIconWorksCorrectly() {
        SignUpPage signUpPage = new SignUpPage(webDriver);
        ElementHelper.typeTextInElement(signUpPage.getPasswordField(), webDriver, XmlReader.getXMLData("password"));
        ElementHelper.clickOnElement(signUpPage.getShowHidePasswordIcon(), webDriver);
        AssertionHelper.assertionAttributeTrueForElement(signUpPage.getPasswordField(), webDriver, "type", "text");
    }

    @Test(groups = {"Priority 2 Modules", "1.3 Medium Severity"}, description = "{{CountryName}}: Verify hide password icon works correctly", priority = 8)
    public void verifyHidePasswordIconWorksCorrectly() {
        SignUpPage signUpPage = new SignUpPage(webDriver);
        ElementHelper.clickOnElement(signUpPage.getShowHidePasswordIcon(), webDriver);
        AssertionHelper.assertionAttributeTrueForElement(signUpPage.getPasswordField(), webDriver, "type", "password");
    }

    @Test(groups = {"Priority 2 Modules", "1.3 Medium Severity"}, description = "{{CountryName}}: Verify show password icon works correctly in the Confirmed Password field", priority = 9)
    public void verifyShowPasswordIconWorksCorrectlyInTheConfirmedPasswordField() {
        SignUpPage signUpPage = new SignUpPage(webDriver);
        ElementHelper.typeTextInElement(signUpPage.getPasswordField(), webDriver, XmlReader.getXMLData("password"));
        ElementHelper.clickOnElement(signUpPage.getShowHideConfirmedPasswordIcon(), webDriver);
        AssertionHelper.assertionAttributeTrueForElement(signUpPage.getConfirmPasswordField(), webDriver, "type", "text");
    }

    @Test(groups = {"Priority 2 Modules", "1.3 Medium Severity"}, description = "{{CountryName}}: Verify hide password icon works correctly in the confirmed password field", priority = 10)
    public void verifyHidePasswordIconWorksCorrectlyInTheConfirmedPasswordField() {
        SignUpPage signUpPage = new SignUpPage(webDriver);
        ElementHelper.clickOnElement(signUpPage.getShowHideConfirmedPasswordIcon(), webDriver);
        AssertionHelper.assertionAttributeTrueForElement(signUpPage.getConfirmPasswordField(), webDriver, "type", "password");
    }

    @Test(groups = {"Priority 2 Modules", "1.1 Critical Severity"}, description = "{{CountryName}}: Verify ability to filling signup form with SMS Option", priority = 11)
    public void signupWithSMSOption() {
        SignUpPage signUpPage = new SignUpPage(webDriver);
        signUpPage.navigateToSignUpLink();
        signUpPage.fillInSignUpForm(DataExtractor.generateJordanPhoneNumber(), XmlReader.getXMLData("password"), true, true);
        signUpPage.clickOnReCaptcha();
        signUpPage.selectTermsAndConditions();
        signUpPage.clickOnSignUpBtn();
        signUpPage.verifyTheDisplayedPageDoesNotHaveErrors();
        try {
            AssertionHelper.validateTheElementIsDisplayed(signUpPage.getRecaptchaImages(), webDriver);
        } catch (Exception e) {

        }
    }

}
