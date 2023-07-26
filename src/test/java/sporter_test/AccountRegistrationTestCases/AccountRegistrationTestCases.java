/**
 * @author w.jumaa
 * @projectName sporter-web-automation
 * @classDescription AccountRegistrationTestCases
 */

package sporter_test.AccountRegistrationTestCases;

import core.BaseTest;
import core.DataHelperAndWait;
import core.WebElementsAssertion;
import org.testng.annotations.Test;
import sporter_pages.AccountRegistrationPage.AccountRegistrationPage;
import sporter_pages.headerSection.HeaderSection;
import sporter_pages.homepage_classes.HomePage;
import sporter_pages.loginPage.LoginPage;
import xml_reader.XmlReader;

import java.io.IOException;

@Test(groups = "2.03 Account Registration")
public class AccountRegistrationTestCases extends BaseTest {
    String storeCountry;

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:  Ability to access the New account registration screen From Account profile icon", priority = 1)
    public void verifyAbilityToAccessNewAccountRegistrationScreen() {
        HeaderSection header = new HeaderSection(webDriver);
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        DataHelperAndWait.clickOnElement(header.getAccountProfileIcon(), webDriver);
        DataHelperAndWait.clickOnElement(registerPage.getCreateAccountOption(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getBecomeASporterHeader(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:  Ability to access the New account registration screen direct from URL", priority = 2)
    public void verifyAbilityToAccessNewAccountRegistrationScreenUsingUrl() throws IOException {
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        WebElementsAssertion.validateTheCurrentUrlContainsString(registerPage.registerAccountLink, webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:  Verify All fields, labels & Components appear correctly in Sign-Up screen", priority = 3)
    public void verifyAllFieldsAppearCorrectlyInSignUp() throws IOException {
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getCreateAnAccountTab(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getHaveAnAccountTab(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getSignInWithSocialMediaLabel(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getSignInUsingFacebookBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getCreateAnAccountLabel(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getEmailField(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getPasswordField(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getConfirmPasswordField(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getCreateAccountBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getAlreadyHaveAccountLabel(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getSignInLink(), webDriver);
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}:  Verify Show Password icon works correctly", priority = 4)
    public void verifyShowPasswordIconWorksCorrectly() throws IOException {
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        registerPage.fillInCreateAccountForm(DataHelperAndWait.generateRandomEmail(), XmlReader.getXMLData("correctPassword"), XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.clickOnElement(registerPage.getShowPasswordIcon(), webDriver);
        WebElementsAssertion.assertionAttributeTrueForElement(registerPage.getPasswordField(), webDriver, "type", "text");
        DataHelperAndWait.clickOnElement(registerPage.getEyeIconOnConfirmPassword(), webDriver);
        WebElementsAssertion.assertionAttributeTrueForElement(registerPage.getConfirmPasswordField(), webDriver, "type", "text");
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:  Verify Hide Password icon works correctly", priority = 5)
    public void verifyHidePasswordIconWorksCorrectly() {
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        DataHelperAndWait.clickOnElement(registerPage.getHidePasswordIcon(), webDriver);
        WebElementsAssertion.assertionAttributeTrueForElement(registerPage.getPasswordField(), webDriver, "type", "password");
        DataHelperAndWait.clickOnElement(registerPage.getEyeIconOnConfirmPassword(), webDriver);
        WebElementsAssertion.assertionAttributeTrueForElement(registerPage.getConfirmPasswordField(), webDriver, "type", "password");
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:  Verify Sign in button appears in the Create Account screen works correctly", priority = 6)
    public void verifySignInBtnInCreateAccountScreenWorksCorrectly() throws IOException {
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        DataHelperAndWait.clickOnElement(registerPage.getSignInLink(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getWelcomeToSporterHeader(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:  Verify clicking on Have Account tab works correctly", priority = 7)
    public void verifyClickingOnHaveAccountTabWorksCorrectly() throws IOException {
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        DataHelperAndWait.clickOnElement(registerPage.getHaveAnAccountTab(), webDriver);
        WebElementsAssertion.assertionAttributeTrueForElement(registerPage.getHaveAnAccountTab(), webDriver, "is-active", "1");
    }

    //TODO: This TC should be revisit after fix bug: https://sporter1.atlassian.net/browse/NS-169
    @Test(enabled = false,groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:  Verify Inability to register an account using email already registered", priority = 8)
    public void verifyInabilityToRegisterAccountUsingEmailAlreadyRegistered() throws IOException {
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        HeaderSection header = new HeaderSection(webDriver);
        LoginPage loginPage = new LoginPage(webDriver);
        registerPage.navigateToRegistrationPage();
        registerPage.fillingAllCreateAccountForms(XmlReader.getXMLData("correctEmail"), XmlReader.getXMLData("correctPassword"), XmlReader.getXMLData("correctPassword"), XmlReader.getXMLData("firstName"), XmlReader.getXMLData("lastName"), 1);

    }

    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}:  Verify the Error Msg related to the Email AAlready Used appears in the correct screen", priority = 9)
    public void verifyWhenRegisterAccountUsingEmailAlreadyRegisteredTheErrorMsgAppearsInCorrectScreen() throws IOException {
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        webDriver.manage().deleteAllCookies();
        registerPage.navigateToRegistrationPage();
        registerPage.fillInCreateAccountForm(XmlReader.getXMLData("correctEmail"), XmlReader.getXMLData("correctPassword"), XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.clickOnElement(registerPage.getCreateAccountBtn(), webDriver);
        DataHelperAndWait.waitForTime(1000);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getEmailErrorMs(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:  Verify the system redirect the customer to Personal information form after clicking on the Create Account Button", priority = 10)
    public void verifyPersonalInfoFormAppearsAfterClickingOnCreateAccountBtn() throws IOException {
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        registerPage.fillInCreateAccountForm(DataHelperAndWait.generateRandomEmail(), XmlReader.getXMLData("correctPassword"), XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.clickOnElement(registerPage.getCreateAccountBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getFirstNameField(), webDriver);
    }

    //There's bug here due to there's no successful Msg
    @Test(groups = {"All Smoke Testing Result", "1.1 Critical Severity"}, description = "{{CountryName}}:  Verify Ability to register new account correctly with Female Gender", priority = 11)
    public void verifyAbilityToRegisterAccountCorrectlyWhenSelectingFemaleGender() throws IOException {
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        HeaderSection header = new HeaderSection(webDriver);
        HomePage homePage = new HomePage(webDriver);

        registerPage.navigateToRegistrationPage();
        registerPage.submitAllCreateAccountFormsCorrectly(DataHelperAndWait.generateRandomEmail(), XmlReader.getXMLData("correctPassword"), XmlReader.getXMLData("correctPassword"), XmlReader.getXMLData("firstName"), XmlReader.getXMLData("lastName"), 2);
        DataHelperAndWait.clickOnElement(header.getSporterLogo(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getVitaminsAndHealthCategory(), webDriver);
        DataHelperAndWait.waitForTime(1500);
        DataHelperAndWait.clickOnElement(header.getAccountProfileIcon(), webDriver);
//        webDriver.navigate().refresh();
//        DataHelperAndWait.waitForTime(4000);
//        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getMyAccountOption(), webDriver);
//        DataHelperAndWait.clickOnElement(registerPage.getLogoutOption(), webDriver);
//        DataHelperAndWait.clickOnElement(header.getSporterLogo(), webDriver);
//        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getVitaminsAndHealthCategory(), webDriver);
//        catch (Exception e){
//            webDriver.navigate().refresh();
//            DataHelperAndWait.waitForTime(4000);
////            WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getMyAccountOption(), webDriver);
////            DataHelperAndWait.clickOnElement(registerPage.getLogoutOption(), webDriver);
////            DataHelperAndWait.clickOnElement(header.getSporterLogo(), webDriver);
////            WebElementsAssertion.validateTheElementIsDisplayed(homePage.getVitaminsAndHealthCategory(), webDriver);
//        }
//        DataHelperAndWait.waitForTime(3000);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:  Verify Ability to register new account correctly with Male Gender", priority = 12)
    public void verifyAbilityToRegisterAccountCorrectlyWhenSelectingMaleGender() throws IOException {
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        HeaderSection header = new HeaderSection(webDriver);
        HomePage homePage = new HomePage(webDriver);
        try {
            registerPage.navigateToHomePage();
            registerPage.navigateToRegistrationPage();
            registerPage.submitAllCreateAccountFormsCorrectly(DataHelperAndWait.generateRandomEmail(), XmlReader.getXMLData("correctPassword"), XmlReader.getXMLData("correctPassword"), XmlReader.getXMLData("firstName"), XmlReader.getXMLData("lastName"), 1);
            DataHelperAndWait.clickOnElement(header.getSporterLogo(), webDriver);
            DataHelperAndWait.waitForTime(2000);
            DataHelperAndWait.clickOnElement(header.getAccountProfileIcon(), webDriver);
            WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getMyAccountOption(), webDriver);
            DataHelperAndWait.clickOnElement(registerPage.getLogoutOption(), webDriver);
            DataHelperAndWait.clickOnElement(header.getSporterLogo(), webDriver);
            WebElementsAssertion.validateTheElementIsDisplayed(homePage.getVitaminsAndHealthCategory(), webDriver);
        }
        catch (Exception e){
            registerPage.navigateToHomePage();
            registerPage.navigateToRegistrationPage();
            registerPage.submitAllCreateAccountFormsCorrectly(DataHelperAndWait.generateRandomEmail(), XmlReader.getXMLData("correctPassword"), XmlReader.getXMLData("correctPassword"), XmlReader.getXMLData("firstName"), XmlReader.getXMLData("lastName"), 1);
            DataHelperAndWait.clickOnElement(header.getSporterLogo(), webDriver);
            DataHelperAndWait.waitForTime(2000);
            DataHelperAndWait.clickOnElement(header.getAccountProfileIcon(), webDriver);
            WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getMyAccountOption(), webDriver);
            DataHelperAndWait.clickOnElement(registerPage.getLogoutOption(), webDriver);
            DataHelperAndWait.clickOnElement(header.getSporterLogo(), webDriver);
            WebElementsAssertion.validateTheElementIsDisplayed(homePage.getVitaminsAndHealthCategory(), webDriver);
        }
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}:  Verify Inability to register new account without filling Email Field", priority = 13)
    public void verifyInabilityToRegisterAccountWithoutFillingEmailField() throws IOException {
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        HeaderSection header = new HeaderSection(webDriver);
        webDriver.manage().deleteAllCookies();
        registerPage.navigateToRegistrationPage();
        registerPage.fillInCreateAccountForm(" ", XmlReader.getXMLData("correctPassword"), XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.clickOnElement(registerPage.getCreateAccountBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getEmailErrorMs(), webDriver);
        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(registerPage.getEmailErrorMs(), webDriver);
    }

    @Test(groups = { "1.3 Medium Severity"}, description = "{{CountryName}}:  Verify Inability to register new account without filling Password Field", priority = 14)
    public void verifyInabilityToRegisterAccountWithoutFillingPasswordField() throws IOException {
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        webDriver.manage().deleteAllCookies();
        registerPage.navigateToRegistrationPage();
        registerPage.fillInCreateAccountForm(XmlReader.getXMLData("correctEmail"), "", XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.clickOnElement(registerPage.getCreateAccountBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getPasswordErrorMsg(), webDriver);
        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(registerPage.getPasswordErrorMsg(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:  Verify Inability to register new account without filling Confirm Password Field", priority = 15)
    public void verifyInabilityToRegisterAccountWithoutFillingConfirmPasswordField() throws IOException {
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        DataHelperAndWait.typeTextInElement(registerPage.getEmailField(), webDriver, XmlReader.getXMLData("correctEmail"));
        DataHelperAndWait.typeTextInElement(registerPage.getPasswordField(), webDriver, XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.clickOnElement(registerPage.getCreateAccountBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getConfirmPasswordErrorMsg(), webDriver);
        if (webDriver.getCurrentUrl().contains("sporter.com/ar")) {
            WebElementsAssertion.assertionTextIsEqual(registerPage.getConfirmPasswordErrorMsg(), webDriver, XmlReader.getXMLData("requiredErrorMsAr"));
        }
        if (webDriver.getCurrentUrl().contains("sporter.com/en")) {
            WebElementsAssertion.assertionTextIsEqual(registerPage.getConfirmPasswordErrorMsg(), webDriver, XmlReader.getXMLData("requiredErrorMsEn"));
        }
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:  Verify Inability to register new account Using email have incorrect Format", priority = 16)
    public void verifyInabilityToRegisterAccountUsingEmailWithIncorrectFormat() throws IOException {
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        registerPage.fillInCreateAccountForm(XmlReader.getXMLData("incorrectEmailFormate"), XmlReader.getXMLData("correctPassword"), XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.clickOnElement(registerPage.getCreateAccountBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getEmailErrorMs(), webDriver);
        if (webDriver.getCurrentUrl().contains("sporter.com/ar")) {
            WebElementsAssertion.assertionWebElementConatinsText(registerPage.getEmailErrorMs(), webDriver, XmlReader.getXMLData("emailFormatErrorAr"));
        }
        if (webDriver.getCurrentUrl().contains("sporter.com/en")) {
            WebElementsAssertion.assertionWebElementEqualText(registerPage.getEmailErrorMs(), webDriver, XmlReader.getXMLData("emailFormatErrorEn"));
        }
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:  Verify Inability to register new account when the entered password is not match with the password rule", priority = 17)
    public void verifyInabilityToRegisterAccountUsingPasswordHaveIncorrectRule() throws IOException {
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        registerPage.fillInCreateAccountForm(XmlReader.getXMLData("correctEmail"), XmlReader.getXMLData("passwordDoesNotMatchTheRules"), XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.clickOnElement(registerPage.getCreateAccountBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getPasswordErrorMsg(), webDriver);
        if (webDriver.getCurrentUrl().contains("sporter.com/ar")) {
            WebElementsAssertion.assertionWebElementConatinsText(registerPage.getPasswordErrorMsg(), webDriver, XmlReader.getXMLData("passwordFormatErrorAr"));
        }
        if (webDriver.getCurrentUrl().contains("sporter.com/en")) {
            WebElementsAssertion.assertionWebElementEqualText(registerPage.getPasswordErrorMsg(), webDriver, XmlReader.getXMLData("passwordFormatErrorEn"));
        }
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:  Verify Inability to register new account when the entered password less than 8 Characters", priority = 18)
    public void verifyInabilityToRegisterAccountUsingPasswordLessThanEightCharacters() throws IOException {
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        registerPage.fillInCreateAccountForm(XmlReader.getXMLData("correctEmail"), XmlReader.getXMLData("shortPassword"), XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.clickOnElement(registerPage.getCreateAccountBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getPasswordErrorMsg(), webDriver);
        if (webDriver.getCurrentUrl().contains("sporter.com/ar")) {
            WebElementsAssertion.assertionWebElementConatinsText(registerPage.getPasswordErrorMsg(), webDriver, XmlReader.getXMLData("passwordShortErrorAr"));
        }
        if (webDriver.getCurrentUrl().contains("sporter.com/en")) {
            WebElementsAssertion.assertionWebElementEqualText(registerPage.getPasswordErrorMsg(), webDriver, XmlReader.getXMLData("passwordShortErrorEn"));
        }
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:  Verify Inability to register new account when the password entered in Confirm Password field with the password you entered in the Password field", priority = 19)
    public void verifyInabilityToRegisterAccountUsingWrongConfirmedPassword() throws IOException {
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        DataHelperAndWait.typeTextInElement(registerPage.getEmailField(), webDriver, XmlReader.getXMLData("correctEmail"));
        DataHelperAndWait.typeTextInElement(registerPage.getPasswordField(), webDriver, XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.typeTextInElement(registerPage.getConfirmPasswordField(), webDriver, XmlReader.getXMLData("shortPassword"));
        DataHelperAndWait.clickOnElement(registerPage.getCreateAccountBtn(), webDriver);
        if (webDriver.getCurrentUrl().contains("sporter.com/ar")) {
            WebElementsAssertion.assertionWebElementConatinsText(registerPage.getConfirmPasswordErrorMsg(), webDriver, XmlReader.getXMLData("confirmpasswordErrorAr"));
        }
        if (webDriver.getCurrentUrl().contains("sporter.com/en")) {
            System.out.println(registerPage.getConfirmPasswordErrorMsg().getText());
            WebElementsAssertion.assertionTextIsEqual(registerPage.getConfirmPasswordErrorMsg(), webDriver, XmlReader.getXMLData("confirmpasswordErrorEn"));
        }
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:  Verify Inability to register new account without filling all required fields", priority = 20)
    public void verifyInabilityToRegisterAccountWithoutFillingAllRequiredFields() throws IOException {
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        DataHelperAndWait.clickOnElement(registerPage.getCreateAccountBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getEmailErrorMs(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getPasswordErrorMsg(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getConfirmPasswordErrorMsg(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:  Verify Inability to register a new account without filling the First and Last Name", priority = 21)
    public void verifyInabilityToRegisterAccountWithoutFillingFirstAndLastName() throws IOException {
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        registerPage.fillInCreateAccountForm(DataHelperAndWait.generateRandomEmail(), XmlReader.getXMLData("correctPassword"), XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.clickOnElement(registerPage.getCreateAccountBtn(), webDriver);
        DataHelperAndWait.hoverOnElementAndClick(registerPage.getMaleOption(), webDriver);
        DataHelperAndWait.clickOnElement(registerPage.getSubmitBtn(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getFirstNameField(), webDriver);
        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(registerPage.getFirstNameErrorMs(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:  Verify ability to register a new account without selecting the gender", priority = 22)
    public void verifyAbilityToRegisterAccountWithoutSelectingTheGender() throws IOException {
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        HeaderSection header = new HeaderSection(webDriver);
        HomePage homePage = new HomePage(webDriver);
        registerPage.navigateToRegistrationPage();
        registerPage.submitAllCreateAccountFormsCorrectly(DataHelperAndWait.generateRandomEmail(), XmlReader.getXMLData("correctPassword"), XmlReader.getXMLData("correctPassword"), XmlReader.getXMLData("firstName"), XmlReader.getXMLData("lastName"), 0);
        DataHelperAndWait.clickOnElement(header.getSporterLogo(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getVitaminsAndHealthCategory(), webDriver);
//        DataHelperAndWait.waitForTime(3000);
        DataHelperAndWait.clickOnElement(header.getAccountProfileIcon(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getMyAccountOption(), webDriver);
        DataHelperAndWait.clickOnElement(registerPage.getLogoutOption(), webDriver);
        DataHelperAndWait.clickOnElement(header.getSporterLogo(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getVitaminsAndHealthCategory(), webDriver);
//        DataHelperAndWait.waitForTime(3000);
    }

    //TODO: To be revisit after fixing https://sporter1.atlassian.net/browse/NS-56
    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:  Verify Sign-up using facebook works correctly", priority = 23)
    public void verifySignUpUsingFaceBookWorks() throws IOException {
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        DataHelperAndWait.clickOnElement(registerPage.getSignInUsingFacebookBtn(), webDriver);
        registerPage.verifyFaceBookIsActive();
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getFaceBookEmail(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getFaceBookPassword(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:  Verify Clicking on Sporter Logo works fine from Create An Account screen", priority = 24)
    public void verifyClickingOnLogoFromCreateAccountScreenWorksCorrectly() throws IOException {
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        HeaderSection header = new HeaderSection(webDriver);
        HomePage homePage = new HomePage(webDriver);
        registerPage.navigateToRegistrationPage();
        DataHelperAndWait.clickOnElement(header.getSporterLogo(), webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getVitaminsAndHealthCategory(), webDriver);
    }

    @Test(groups = {"1.3 Medium Severity"}, description = "{{CountryName}}:  Verify Inability to register a new account when filling the First and Last Name with spaces", priority = 25)
    public void verifyInabilityToRegisterAccountWhenFillingFirstAndLastNameWithSpaces() throws IOException {
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        registerPage.submitAllCreateAccountFormsWrongly(DataHelperAndWait.generateRandomEmail(), XmlReader.getXMLData("correctPassword"), XmlReader.getXMLData("correctPassword"), XmlReader.getXMLData("space"), XmlReader.getXMLData("space"), 2);
        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(registerPage.getFirstNameErrorMs(), webDriver);
        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(registerPage.getLastNameErrorMs(), webDriver);
    }

    @Test(groups = {"1.4 Low Severity"}, description = "{{CountryName}}:  Verify A Validation Msg will appear when filling the First Name & Last Name field with text contains a special Character", priority = 26)
    public void verifyAValidationMsgWillAppearWhenFillingFirstAndLastNameWithIncorrectText() throws IOException {
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        registerPage.fillingAllCreateAccountForms(DataHelperAndWait.generateRandomEmail(), XmlReader.getXMLData("correctPassword"), XmlReader.getXMLData("correctPassword"), "w@@", "w@@", 2);
        if (webDriver.getCurrentUrl().contains("sporter.com/ar")) {
            WebElementsAssertion.assertionTextIsEqual(registerPage.getFirstNameErrorMs(), webDriver, XmlReader.getXMLData("nameErrorAr"));
        }
        if (webDriver.getCurrentUrl().contains("sporter.com/en")) {
            WebElementsAssertion.assertionTextIsEqual(registerPage.getFirstNameErrorMs(), webDriver, XmlReader.getXMLData("nameErrorEn"));
        }
    }

    //TODO: There's a bug here & we will revisit it after fixing: https://sporter1.atlassian.net/browse/NS-56
    //TODO: Needst o check  it after that enabel the testcase
    @Test(enabled = false,groups = {"All Smoke Testing Result", "1.2 High Severity"}, description = "{{CountryName}}:  Verify ability to sign up using FaceBook account", priority = 27)
    public void verifyAbilityToSignUpUsingFaceBook() throws IOException {
        AccountRegistrationPage registerPage = new AccountRegistrationPage(webDriver);
        try{registerPage.logout();}catch (Exception e3){}
        webDriver.manage().deleteAllCookies();
        webDriver.manage().deleteAllCookies();
        DataHelperAndWait.waitForTime(2000);
        registerPage.navigateToRegistrationPage();
        DataHelperAndWait.waitForTime(2000);
        DataHelperAndWait.clickOnElement(registerPage.getSignInUsingFacebookBtn(), webDriver);
        registerPage.verifyFaceBookIsActive();
        DataHelperAndWait.typeTextInElement(registerPage.getFaceBookEmail(), webDriver, XmlReader.getXMLData("correctEmail"));
        DataHelperAndWait.typeTextInElement(registerPage.getFaceBookPassword(), webDriver, XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.clickOnElement(registerPage.getLoginInFaceBookPage(), webDriver);
//        registerPage.verifyFaceBookIsActive();
    }
}