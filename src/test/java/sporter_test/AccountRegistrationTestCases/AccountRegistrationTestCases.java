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
import xml_reader.XmlReader;

@Test(groups = "2.04 Account Registration")
public class AccountRegistrationTestCases extends BaseTest {
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:  Ability to access the New account registration screen From Account profile icon", priority = 1)
    public void verifyAbilityToAccessNewAccountRegistrationScreen(){
        HeaderSection header= new HeaderSection(webDriver);
        AccountRegistrationPage registerPage= new AccountRegistrationPage(webDriver);
        DataHelperAndWait.clickOnElement(header.getAccountProfileIcon(),webDriver);
        DataHelperAndWait.clickOnElement(registerPage.getCreateAccountOption(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getBecomeASporterHeader(),webDriver);
    }
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:  Ability to access the New account registration screen direct from URL", priority = 2)
    public void verifyAbilityToAccessNewAccountRegistrationScreenUsingUrl(){
        AccountRegistrationPage registerPage= new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        WebElementsAssertion.validateTheCurrentUrlContainsString(registerPage.registerAccountLink,webDriver);
    }
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:  Verify All fields, labels & Components appear correctly in Sign-Up screen", priority = 3)
    public void verifyAllFieldsAppearCorrectlyInSignUp(){
        AccountRegistrationPage registerPage= new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getCreateAnAccountTab(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getHaveAnAccountTab(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getSignInWithSocialMediaLabel(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getSignInUsingFacebookBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getCreateAnAccountLabel(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getEmailField(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getPasswordField(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getConfirmPasswordField(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getCreateAccountBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getAlreadyHaveAccountLabel(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getSignInLink(),webDriver);
    }
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:  Verify the system redirect the customer to Personal information form after clicking on the Create Account Button", priority = 4)
    public void verifyPersonalInfoFormAppearsAfterClickingOnCreateAccountBtn(){
        AccountRegistrationPage registerPage= new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        registerPage.fillInCreateAccountForm(DataHelperAndWait.generateRandomEmail(),XmlReader.getXMLData("correctPassword"),XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.clickOnElement(registerPage.getCreateAccountBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getFirstNameField(),webDriver);
    }
    //There's bug here due to there's no successful Msg
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:  Verify Ability to register new account correctly with Female Gender", priority = 5)
    public void verifyAbilityToRegisterAccountCorrectlyWhenSelectingFemaleGender(){
        AccountRegistrationPage registerPage= new AccountRegistrationPage(webDriver);
        HeaderSection header= new HeaderSection(webDriver);
        registerPage.navigateToRegistrationPage();
        registerPage.submitAllCreateAccountForms(DataHelperAndWait.generateRandomEmail(),XmlReader.getXMLData("correctPassword"),XmlReader.getXMLData("correctPassword"),XmlReader.getXMLData("firstName"),XmlReader.getXMLData("lastName"),2);
        DataHelperAndWait.clickOnElement(header.getAccountProfileIcon(),webDriver);
        DataHelperAndWait.waitForTime(500);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getMyAccountOption(),webDriver);
        DataHelperAndWait.clickOnElement(registerPage.getLogoutOption(),webDriver);

    }
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:  Verify Ability to register new account correctly with Male Gender", priority = 6)
    public void verifyAbilityToRegisterAccountCorrectlyWhenSelectingMaleGender(){
        AccountRegistrationPage registerPage= new AccountRegistrationPage(webDriver);
        HeaderSection header= new HeaderSection(webDriver);
        registerPage.navigateToRegistrationPage();
        registerPage.submitAllCreateAccountForms(DataHelperAndWait.generateRandomEmail(),XmlReader.getXMLData("correctPassword"),XmlReader.getXMLData("correctPassword"),XmlReader.getXMLData("firstName"),XmlReader.getXMLData("lastName"),1);
        DataHelperAndWait.clickOnElement(header.getAccountProfileIcon(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getMyAccountOption(),webDriver);
        DataHelperAndWait.clickOnElement(registerPage.getLogoutOption(),webDriver);
    }
    //TODO: This TC should be revisit after fix bug: https://sporter1.atlassian.net/browse/NS-169
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:  Verify Inability to register an account using email already registered", priority = 7)
    public void verifyInabilityToRegisterAccountUsingEmailAlreadyRegistered(){
        AccountRegistrationPage registerPage= new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        registerPage.submitAllCreateAccountForms(XmlReader.getXMLData("correctEmail"),XmlReader.getXMLData("correctPassword"),XmlReader.getXMLData("correctPassword"),XmlReader.getXMLData("firstName"),XmlReader.getXMLData("lastName"),1);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getEmailUsedMsg(),webDriver);
    }
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:  Verify the Error Msg related to the Email AAlready Used appears in the correct screen", priority = 8)
    public void verifyWhenRegisterAccountUsingEmailAlreadyRegisteredTheErrorMsgAppearsInCorrectScreen(){
        AccountRegistrationPage registerPage= new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        registerPage.fillInCreateAccountForm(XmlReader.getXMLData("correctEmail"),XmlReader.getXMLData("correctPassword"),XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.clickOnElement(registerPage.getCreateAccountBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getEmailErrorMs(),webDriver);
    }
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:  Verify Inability to register new account without filling Email Field", priority = 9)
    public void verifyInabilityToRegisterAccountWithoutFillingEmailField(){
        AccountRegistrationPage registerPage= new AccountRegistrationPage(webDriver);
        HeaderSection header= new HeaderSection(webDriver);
        registerPage.navigateToRegistrationPage();
        registerPage.fillInCreateAccountForm(" ",XmlReader.getXMLData("correctPassword"),XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.clickOnElement(registerPage.getCreateAccountBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getEmailErrorMs(),webDriver);
        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(registerPage.getEmailErrorMs(),webDriver);
    }
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:  Verify Inability to register new account without filling Password Field", priority = 10)
    public void verifyInabilityToRegisterAccountWithoutFillingPasswordField(){
        AccountRegistrationPage registerPage= new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        registerPage.fillInCreateAccountForm(XmlReader.getXMLData("correctEmail"),"",XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.clickOnElement(registerPage.getCreateAccountBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getPasswordErrorMsg(),webDriver);
        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(registerPage.getPasswordErrorMsg(),webDriver);
    }
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:  Verify Inability to register new account without filling Confirm Password Field", priority = 11)
    public void verifyInabilityToRegisterAccountWithoutFillingConfirmPasswordField(){
        AccountRegistrationPage registerPage= new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        DataHelperAndWait.typeTextInElement(registerPage.getEmailField(),webDriver,XmlReader.getXMLData("correctEmail"));
        DataHelperAndWait.typeTextInElement(registerPage.getPasswordField(),webDriver ,XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.clickOnElement(registerPage.getCreateAccountBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getConfirmPasswordErrorMsg(),webDriver);
        if(webDriver.getCurrentUrl().contains("sporter.com/ar")){
            WebElementsAssertion.assertionWebElementConatinsText(registerPage.getConfirmPasswordErrorMsg(),webDriver,XmlReader.getXMLData("requiredErrorMsAr"));}
        if(webDriver.getCurrentUrl().contains("sporter.com/en")){
            WebElementsAssertion.assertionWebElementEqualText(registerPage.getConfirmPasswordErrorMsg(),webDriver,XmlReader.getXMLData("requiredErrorMsEn"));
        }    }
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:  Verify Inability to register new account Using email have incorrect Format", priority = 12)
    public void verifyInabilityToRegisterAccountUsingEmailWithIncorrectFormat(){
        AccountRegistrationPage registerPage= new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        registerPage.fillInCreateAccountForm(XmlReader.getXMLData("incorrectEmailFormate"),XmlReader.getXMLData("correctPassword"),XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.clickOnElement(registerPage.getCreateAccountBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getEmailErrorMs(),webDriver);
        if(webDriver.getCurrentUrl().contains("sporter.com/ar")){
        WebElementsAssertion.assertionWebElementConatinsText(registerPage.getEmailErrorMs(),webDriver,XmlReader.getXMLData("emailFormatErrorAr"));}
        if(webDriver.getCurrentUrl().contains("sporter.com/en")){
            WebElementsAssertion.assertionWebElementEqualText(registerPage.getEmailErrorMs(),webDriver,XmlReader.getXMLData("emailFormatErrorEn"));
        }
    }
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:  Verify Inability to register new account when the entered password is not match with the password rule", priority = 13)
    public void verifyInabilityToRegisterAccountUsingPasswordHaveIncorrectRule(){
        AccountRegistrationPage registerPage= new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        registerPage.fillInCreateAccountForm(XmlReader.getXMLData("correctEmail"),XmlReader.getXMLData("passwordDoesNotMatchTheRules"),XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.clickOnElement(registerPage.getCreateAccountBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getPasswordErrorMsg(),webDriver);
        if(webDriver.getCurrentUrl().contains("sporter.com/ar")){
        WebElementsAssertion.assertionWebElementConatinsText(registerPage.getPasswordErrorMsg(),webDriver,XmlReader.getXMLData("passwordFormatErrorAr"));}
        if(webDriver.getCurrentUrl().contains("sporter.com/en")){
            WebElementsAssertion.assertionWebElementEqualText(registerPage.getPasswordErrorMsg(),webDriver,XmlReader.getXMLData("passwordFormatErrorEn"));
        }
    }

    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:  Verify Inability to register new account when the entered password less than 8 Characters", priority = 14)
    public void verifyInabilityToRegisterAccountUsingPasswordLessThanEightCharacters(){
        AccountRegistrationPage registerPage= new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        registerPage.fillInCreateAccountForm(XmlReader.getXMLData("correctEmail"),XmlReader.getXMLData("shortPassword"),XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.clickOnElement(registerPage.getCreateAccountBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getPasswordErrorMsg(),webDriver);
        if(webDriver.getCurrentUrl().contains("sporter.com/ar")){
        WebElementsAssertion.assertionWebElementConatinsText(registerPage.getPasswordErrorMsg(),webDriver,XmlReader.getXMLData("passwordShortErrorAr"));}
        if(webDriver.getCurrentUrl().contains("sporter.com/en")){
            WebElementsAssertion.assertionWebElementEqualText(registerPage.getPasswordErrorMsg(),webDriver,XmlReader.getXMLData("passwordShortErrorEn"));
        }
    }
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:  Verify Inability to register new account when the password entered in Confirm Password field with the password you entered in the Password field", priority = 15)
    public void verifyInabilityToRegisterAccountUsingWrongConfirmedPassword(){
        AccountRegistrationPage registerPage= new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        registerPage.fillInCreateAccountForm(XmlReader.getXMLData("correctEmail"),XmlReader.getXMLData("correctPassword"),"testw");
        DataHelperAndWait.clickOnElement(registerPage.getCreateAccountBtn(),webDriver);
        if(webDriver.getCurrentUrl().contains("sporter.com/ar")){
        WebElementsAssertion.assertionWebElementConatinsText(registerPage.getConfirmPasswordErrorMsg(),webDriver,XmlReader.getXMLData("confirmpasswordErrorAr"));}
        if(webDriver.getCurrentUrl().contains("sporter.com/en")){
            WebElementsAssertion.assertionWebElementConatinsText(registerPage.getConfirmPasswordErrorMsg(),webDriver,XmlReader.getXMLData("confirmpasswordErrorEn"));
        }
    }
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:  Verify Inability to register new account without filling all required fields", priority = 16)
    public void verifyInabilityToRegisterAccountWithoutFillingAllRequiredFields(){
        AccountRegistrationPage registerPage= new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        DataHelperAndWait.clickOnElement(registerPage.getCreateAccountBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getEmailErrorMs(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getPasswordErrorMsg(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getConfirmPasswordErrorMsg(),webDriver);
    }






}
