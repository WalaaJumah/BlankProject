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
import xml_reader.XmlReader;

import javax.sound.midi.ShortMessage;

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
            WebElementsAssertion.assertionTextIsEqual(registerPage.getConfirmPasswordErrorMsg(),webDriver,XmlReader.getXMLData("requiredErrorMsAr"));}
        if(webDriver.getCurrentUrl().contains("sporter.com/en")){
            WebElementsAssertion.assertionTextIsEqual(registerPage.getConfirmPasswordErrorMsg(),webDriver,XmlReader.getXMLData("requiredErrorMsEn"));
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
        DataHelperAndWait.typeTextInElement(registerPage.getEmailField(),webDriver,XmlReader.getXMLData("correctEmail"));
        DataHelperAndWait.typeTextInElement(registerPage.getPasswordField(),webDriver ,XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.typeTextInElement(registerPage.getConfirmPasswordField(),webDriver ,XmlReader.getXMLData("shortPassword"));
        DataHelperAndWait.clickOnElement(registerPage.getCreateAccountBtn(),webDriver);
        if(webDriver.getCurrentUrl().contains("sporter.com/ar")){
        WebElementsAssertion.assertionWebElementConatinsText(registerPage.getConfirmPasswordErrorMsg(),webDriver,XmlReader.getXMLData("confirmpasswordErrorAr"));}
        if(webDriver.getCurrentUrl().contains("sporter.com/en")){
            System.out.println(registerPage.getConfirmPasswordErrorMsg().getText());
            WebElementsAssertion.assertionTextIsEqual(registerPage.getConfirmPasswordErrorMsg(),webDriver,XmlReader.getXMLData("confirmpasswordErrorEn"));
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
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:  Verify Inability to register a new account without filling the First and Last Name", priority = 17)
    public void verifyInabilityToRegisterAccountWithoutFillingFirstAndLastName(){
        AccountRegistrationPage registerPage= new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        registerPage.fillInCreateAccountForm(DataHelperAndWait.generateRandomEmail(),XmlReader.getXMLData("correctPassword"),XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.clickOnElement(registerPage.getCreateAccountBtn(),webDriver);
        DataHelperAndWait.hoverOnElementAndClick(registerPage.getMaleOption(),webDriver);
        DataHelperAndWait.clickOnElement(registerPage.getSubmitBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getFirstNameField(),webDriver);
        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(registerPage.getFirstNameErrorMs(),webDriver);
    }
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:  Verify ability to register a new account without selecting the gender", priority = 18)
    public void verifyAbilityToRegisterAccountWithoutSelectingTheGender(){
        AccountRegistrationPage registerPage= new AccountRegistrationPage(webDriver);
        HomePage homePage= new HomePage(webDriver);
        HeaderSection header=new HeaderSection(webDriver);
        registerPage.navigateToRegistrationPage();
        registerPage.fillInCreateAccountForm(DataHelperAndWait.generateRandomEmail(),XmlReader.getXMLData("correctPassword"),XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.clickOnElement(registerPage.getCreateAccountBtn(),webDriver);
        registerPage.fillInExtraInformationForm("Walaa","Mohammad");
        DataHelperAndWait.clickOnElement(registerPage.getSubmitBtn(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getVitaminsAndHealthCategory(),webDriver);
        DataHelperAndWait.clickOnElement(header.getAccountProfileIcon(),webDriver);
        DataHelperAndWait.clickOnElement(registerPage.getLogoutOption(),webDriver);
    }
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:  Verify Sign in button appears in the Create Account screen works correctly", priority = 19)
    public void verifySignInBtnInCreateAccountScreenWorksCorrectly(){
        AccountRegistrationPage registerPage= new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        DataHelperAndWait.clickOnElement(registerPage.getSignInLink(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getWelcomeToSporterHeader(),webDriver);
    }
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:  Verify Show Password icon works correctly", priority = 22)
    public void verifyShowPasswordIconWorksCorrectly(){
        AccountRegistrationPage registerPage= new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        registerPage.fillInCreateAccountForm(DataHelperAndWait.generateRandomEmail(),XmlReader.getXMLData("correctPassword"),XmlReader.getXMLData("correctPassword"));
        DataHelperAndWait.clickOnElement(registerPage.getEyeIconOnPassword(),webDriver);
        WebElementsAssertion.assertionAttributeTrueForElement(registerPage.getPasswordField(),webDriver,"type","text");
        DataHelperAndWait.clickOnElement(registerPage.getEyeIconOnConfirmPassword(),webDriver);
        WebElementsAssertion.assertionAttributeTrueForElement(registerPage.getConfirmPasswordField(),webDriver,"type","text");
    }
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:  Verify Hide Password icon works correctly", priority = 23)
    public void verifyHidePasswordIconWorksCorrectly(){
        AccountRegistrationPage registerPage= new AccountRegistrationPage(webDriver);
        DataHelperAndWait.clickOnElement(registerPage.getEyeIconOnPassword(),webDriver);
        WebElementsAssertion.assertionAttributeTrueForElement(registerPage.getPasswordField(),webDriver,"type","password");
        DataHelperAndWait.clickOnElement(registerPage.getEyeIconOnConfirmPassword(),webDriver);
        WebElementsAssertion.assertionAttributeTrueForElement(registerPage.getConfirmPasswordField(),webDriver,"type","password");
    }
    //TODO: To be revisit after fixing https://sporter1.atlassian.net/browse/NS-56
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:  Verify Sign-up using facebook works correctly", priority = 24)
    public void verifySignUpUsingFaceBookWorks(){
        AccountRegistrationPage registerPage= new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        DataHelperAndWait.clickOnElement(registerPage.getSignInUsingFacebookBtn(),webDriver);
        registerPage.verifyFaceBookIsActive();
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getFaceBookEmail(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(registerPage.getFaceBookPassword(),webDriver);
    }
       @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:  Verify clicking on Have Account tab works correctly", priority = 25)
    public void verifyClickingOnHaveAccountTabWorksCorrectly(){
        AccountRegistrationPage registerPage= new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        DataHelperAndWait.clickOnElement(registerPage.getHaveAnAccountTab(),webDriver);
        WebElementsAssertion.assertionAttributeTrueForElement(registerPage.getHaveAnAccountTab(),webDriver,"active","1");
    }
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:  Verify Clicking on Sporter Logo works fine from Create An Account screen", priority = 26)
    public void verifyClickingOnLogoFromCreateAccountScreenWorksCorrectly(){
        AccountRegistrationPage registerPage= new AccountRegistrationPage(webDriver);
        HeaderSection header= new HeaderSection(webDriver);
        HomePage homePage= new HomePage(webDriver);
        registerPage.navigateToRegistrationPage();
        DataHelperAndWait.clickOnElement(header.getSporterLogo(),webDriver);
        WebElementsAssertion.validateTheElementIsDisplayed(homePage.getVitaminsAndHealthCategory(),webDriver);
    }
    @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:  Verify Inability to register a new account when filling the First and Last Name with spaces", priority = 27)
    public void verifyInabilityToRegisterAccountWhenFillingFirstAndLastNameWithSpaces(){
        AccountRegistrationPage registerPage= new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        registerPage.submitAllCreateAccountForms(DataHelperAndWait.generateRandomEmail(),XmlReader.getXMLData("correctPassword"),XmlReader.getXMLData("correctPassword"),XmlReader.getXMLData(" "),XmlReader.getXMLData(" "),2);
        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(registerPage.getFirstNameErrorMs(),webDriver);
        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(registerPage.getLastNameErrorMs(),webDriver);
    }
      @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:  Verify A Validation Msg will appear when filling the First Name & Last Name field with text contains a special Character", priority = 28)
    public void verifyAValidationMsgWillAppearWhenFillingFirstAndLastNameWithIncorrectText(){
        AccountRegistrationPage registerPage= new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        registerPage.submitAllCreateAccountForms(DataHelperAndWait.generateRandomEmail(),XmlReader.getXMLData("correctPassword"),XmlReader.getXMLData("correctPassword"),"w@@","w@@",2);
        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(registerPage.getFirstNameErrorMs(),webDriver);
        WebElementsAssertion.checkRequiredErrorMsgIsDisplayed(registerPage.getLastNameErrorMs(),webDriver);
    }
    //TODO: There's a bug here & we will revisit it after fixing: https://sporter1.atlassian.net/browse/NS-56
      @Test(groups = {"All Smoke Testing Result","1.1 Critical Severity"},description = "{{CountryName}}:  Verify ability to sign up using FaceBook account", priority = 29)
    public void verifyAbilityToSignUpUsingFaceBook(){
        AccountRegistrationPage registerPage= new AccountRegistrationPage(webDriver);
        registerPage.navigateToRegistrationPage();
        DataHelperAndWait.clickOnElement(registerPage.getSignInUsingFacebookBtn(),webDriver);
        registerPage.verifyFaceBookIsActive();
        DataHelperAndWait.typeTextInElement(registerPage.getFaceBookEmail(),webDriver,XmlReader.getXMLData("correctEmail"));
        DataHelperAndWait.typeTextInElement(registerPage.getFaceBookPassword(),webDriver,XmlReader.getXMLData("correctPassword"));
          DataHelperAndWait.clickOnElement(registerPage.getLoginInFaceBookPage(),webDriver);
          registerPage.verifyFaceBookIsActive();

      }

}
